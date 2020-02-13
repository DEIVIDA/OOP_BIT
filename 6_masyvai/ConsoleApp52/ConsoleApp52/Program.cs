using System;
//1 Užduotis
namespace ConsoleApp52
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Iveskite apskritimu skaiciu: ");
			int apsSk = int.Parse(Console.ReadLine());

			//Sukuriamas ir uzpildomas "apsSk" dydzio masyvas
			int[] arr = new int[apsSk];

			Console.WriteLine("Iveskite apskritimu spindulius: ");

			for (int i = 0; i < arr.Length; i++)
			{
				arr[i] = int.Parse(Console.ReadLine());

			}

			// Surandamas didziausias masyvo elementas
			int bigR = 0;

			for (int i = 0; i < arr.Length; i++)
			{
				if (arr[i] > bigR) bigR = arr[i];
			}

			// Suskaiciuojama kiek yra didziausiu masyvo elementu
			int bigRsk = 0;

			for (int i = 0; i < arr.Length; i++)
			{
				if (arr[i] >= bigR) bigRsk ++;
			}

			Console.WriteLine("Didziausias spindulys: " + bigR + ", tokiu apskritimu yra: " + bigRsk);
		}
    }
}
