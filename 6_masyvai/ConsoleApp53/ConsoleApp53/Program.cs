using System;
//2 užduotis
//Klaviatūra įvedama n skaičių.Pirmiausia įvedamas skaičių kiekis.Surikiuokite šiuos skaičius mažėjimo tvarka ir juos išveskite.
namespace ConsoleApp53
{
    class Program
    {
		static void Main(string[] args)
		{
			Console.WriteLine("Iveskite kiek bus ivedama skaiciu: ");
			int sk = int.Parse(Console.ReadLine());

			int[] arr = new int[sk];

			Console.WriteLine("Iveskite skaicius: ");

			for (int i = 0; i < arr.Length; i++)
			{
				arr[i] = int.Parse(Console.ReadLine());
			}

			Console.WriteLine("Skaiciai surikiuoti mazejimo tvarka: ");
			int didSk;
			int tmp;
			for (int i = 0; i < arr.Length; i++)
			{
				tmp = arr[i];
				didSk = arr[i];
				//surandamas didziausias skaicius masyvo atkarpoje nuo i iki galo
				for (int l = i; l < arr.Length; l++)
				{
					if (arr[l] > didSk) didSk = arr[l];
				}
				//i didziausio skaiciaus vieta irasomas arr[i]/tmp
				for (int j = i + 1; j < arr.Length; j++)
				{
					if (arr[j] == didSk) arr[j] = tmp;

				}

				arr[i] = didSk;
				Console.Write(arr[i]+" ");


			}
		}
    }
}
