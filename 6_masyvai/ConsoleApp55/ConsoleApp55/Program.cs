using System;
//4 užduotis
namespace ConsoleApp55
{
	class Program
	{
		//metodas grazinantis kiek masyve yra sudetiniu skaiciu
		public static int compositeNumb(int[] numbers)
		{
			int odd = 0;
			for (int i = 0; i < numbers.Length; i++)
			{
				int tmp = 0;
				for (int j = 1; j <= numbers[i]; j++)
				{
					if (numbers[i] % j == 0) tmp++;
				}
				if (tmp >= 3) odd++;
			}
			return odd;
		}

		//metodas patikrinantis ar skaicius yra sudetinis
		public static bool composite(int number)
		{
			int tmp = 0;

			for (int i = 1; i <= number; i++)
			{
				if (number % i == 0) tmp++;
			}

			if (tmp >= 3) return true;
			else return false;
		}

		static void Main(string[] args)
		{
			//Pradiniu duomenu suvedimas
			Console.WriteLine("Iveskite kiek bus ivedama skaiciu: ");
			int numbers = int.Parse(Console.ReadLine());

			int[] arr = new int[numbers];

			Console.WriteLine("Iveskite skaicius: ");

			for (int i = 0; i < arr.Length; i++)
			{
				arr[i] = int.Parse(Console.ReadLine());
			}

			// Sukuriami masyvai sudetiniams ir pirminiams skaiciams
			int[] arrComp = new int[compositeNumb(arr)];
			int[] arrPrim = new int[arr.Length - compositeNumb(arr)];

			int ptmp = 0;
			int ctmp = 0;

			//Uzpildomi masyvai
			for (int i = 0; i < arr.Length; i++)
			{
				if (composite(arr[i]))
				{
					arrComp[ctmp] = arr[i];
					ctmp++;
				}
				else
				{
					arrPrim[ptmp] = arr[i];
					ptmp++;
				}
			}
			//Rezultatu isvedimas
			Console.Write("Pirminiai skaiciai: ");
			foreach (int i in arrPrim)
			{
				Console.Write("{0} ", i);
			}
			Console.WriteLine();
			Console.Write("sudetiniai skaiciai: ");
			foreach (int i in arrComp)
			{
				Console.Write("{0} ", i);
			}
		}
	}
}
