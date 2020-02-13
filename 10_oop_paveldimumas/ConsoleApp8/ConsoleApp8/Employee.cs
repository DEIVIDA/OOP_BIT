using System;
using System.Collections.Generic;
using System.Text;

namespace ConsoleApp8
{
	class Employee
	{
		private string name;
		private string surname;
		private int workingHours;
		private int rate;

		public Employee(){ }

		public Employee(string name, string surname, int workingHours, int rate)
		{
			this.name = name;
			this.surname = surname;
			this.workingHours = workingHours;
			this.rate = rate;
		}
		//Name get and set
		public string Name
		{
			get
			{
				return this.name;
			}
			set
			{
				this.name = value;
			}
		}
		//Surname get and set
		public string Surname
		{
			get
			{
				return this.surname;
			}
			set
			{
				this.surname = value;
			}
		}
		//WorkingHours get and set
		public int WorkingHours
		{
			get
			{
				return this.workingHours;
			}
			set
			{
				this.workingHours = value;
			}
		}
		//Rate get and set
		public int Rate
		{
			get
			{
				return this.rate;
			}
			set
			{
				this.rate = value;
			}
		}		

		public string ToStrings()
		{
			return "name: " + name + ", surname: " + surname + ", workingHours: " + workingHours + ", rate: " + rate;
		}

		public int GetSalary()
		{
			return this.workingHours * this.rate;
		}






	}
}
