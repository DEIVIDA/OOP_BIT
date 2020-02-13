using System;

namespace ConsoleApp41
{
    class Program
    {
        /*1. Užduotis. 
          Rekursinė funkcija, suskaičiuojanti natūralaus skaičiaus sk skaitmenų sumą
        */
        public static int Suma(int sk)
        {
            if (sk < 10)
            {
                return sk;
            }
            else
            {
                return sk % 10 + Suma(sk / 10);
            }
        }
        /*2. Užduotis. 
         Rekursinė funkcija, apverčianti natūralųjį skaičių sk
       */
        public static int Reverse(int sk)
        {
            int x = Ten(sk);
            if (sk < 10)
            {
                return sk;
            }
            else
            {
                return ((sk % 10) * (int)Math.Pow(10.0, (double)(Ten(sk) - 1)) + Reverse(sk / 10));
            }
        }

        //Metodas apskaičiuoti iš kiek skaitmenų susideda skaičius sk
        public static int Ten(int sk)
        {
            if (sk < 10)
            {
                return 1;
            }
            else
            {
                return 1 + Ten(sk / 10);
            }
        }
                      

        static void Main(string[] args)
        {
            Console.WriteLine(Suma(12345));
            Console.WriteLine(Reverse(12345));
            
        }
    }
}
