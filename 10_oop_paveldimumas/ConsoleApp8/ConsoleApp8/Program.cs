using System;

namespace ConsoleApp8
{
    class Program
    {
        static void Main(string[] args)
        {
            
            Employee jonas = new Employee();
            jonas.Name="Jonas";
            jonas.Surname="Jonaitis";
            jonas.WorkingHours=10;
            jonas.Rate=15;

            Employee petras = new Employee("Petras", "Petraitis", 160, 20);
           
            Manager virgis = new Manager("Virgis", "Virginskis", 160, 20, 5);
            
            Console.WriteLine(jonas.ToStrings());
            Console.WriteLine(jonas.GetSalary());
            Console.WriteLine(virgis.ToStrings());
            Console.WriteLine(virgis.GetSalary());
        }
    }
}
