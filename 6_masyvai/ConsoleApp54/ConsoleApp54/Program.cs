using System;
//3 užduotis
namespace ConsoleApp54
{
    class Program
    {
        static void Main(string[] args)
        {
           
			Console.WriteLine("Iveskite kiek yra namu: ");
			int houseNo = int.Parse(Console.ReadLine());

			int n = houseNo / 2;
			int e = 0;

			int[] odd = new int[(houseNo - n)];
			int[] even = new int[n];				

			for (int i = 1; i <= houseNo; i++)
			{
				Console.WriteLine("Iveskite gyventoju skaiciu name Nr."+i);
				int residents = int.Parse(Console.ReadLine());
				//lyginiai
				if (i % 2 == 0)
				{
					even[e] = residents;
					e++;
				}
				//nelyginiai
				else odd[i / 2] = residents;
			}

			int oddSum = 0;
			int evenSum = 0;

			for (int j = 0; j < odd.Length; j++)
			{
				oddSum += odd[j];

			}

			for (int k = 0; k < even.Length; k++)
			{
				evenSum += even[k];

			}

			double average = (double) (evenSum + oddSum) / houseNo;
			Console.WriteLine("Gyventoju skaicius kaireje gatves puseje: " + oddSum);
			Console.WriteLine("Gyventoju skaicius desineje gatves puseje: " + evenSum);
			Console.WriteLine("Vidutinis gyventoju skaicius name: " + average);
		}
    }
}
