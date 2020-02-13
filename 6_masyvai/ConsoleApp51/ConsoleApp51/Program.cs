using System;
//Papildoma užduotis
namespace ConsoleAppPapildoma
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Iveskite sandeliu skaiciu");
            int n = int.Parse(Console.ReadLine());
            int[] sand = new int[n];
            int svoris = 0;

            for (int i = 1; i < n; i++)
            {
                Console.WriteLine("kroviniu skaicius isvezamas is sandelio Nr." + i);
                int mi = int.Parse(Console.ReadLine());
                for (int j = 1; j <= mi; j++)
                {
                    Console.WriteLine("krovinis Nr." + j + " vezamas i sandeli Nr.:");
                    int si = int.Parse(Console.ReadLine());
                    Console.WriteLine("krovinio Nr." + j + " svoris:");
                    int pi = int.Parse(Console.ReadLine());
                    sand[(si - 1)] += pi;
                }
            }

            for (int i = 0; i < sand.Length; i++)
            {
                if (sand[i] > svoris)
                {
                    svoris = sand[i];
                }
            }
            System.Console.Write("Mažiausias būtinas krovininio automobilio pavežamas svoris - {0} ", svoris);
        }
    }
}
