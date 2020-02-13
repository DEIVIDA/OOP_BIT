using System;
using System.Collections.Generic;
using System.Text;

namespace ConsoleApp8
{
    class Manager:Employee
    {

		int employeeCount;

		public Manager() { }

		public Manager(string name, string surname, int workingHours, int rate, int employeeCount)
		{
			this.Name = name;
			this.Surname = surname;
			this.WorkingHours = workingHours;
			this.Rate = rate;
			this.employeeCount = employeeCount;
		}

		public new int GetSalary()
		{
			return this.WorkingHours * this.Rate + (this.employeeCount * this.WorkingHours);
		}				
		

	}
}
