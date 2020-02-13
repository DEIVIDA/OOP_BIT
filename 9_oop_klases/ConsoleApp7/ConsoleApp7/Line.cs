using System;
using System.Collections.Generic;
using System.Text;

namespace ConsoleApp7
{
    class Line
    {
		private Point p1;
		private Point p2;
				
		public Line(Point p1, Point p2)
		{			
			this.p1 = p1;
			this.p2 = p2;
		}
		
		//Line lenght between point p1 and p2
		public double lineLenght()
		{
			double xdif = p1.X - p2.X;
			double ydif = p1.Y - p2.Y;
			return Math.Sqrt(xdif * xdif + ydif * ydif);

		}
		
		//Line to string
		public string ToStrings()
		{
			return "Line (p1" + p1.ToStrings() + ", p2" + p2.ToStrings() + ")";
		}
	}
}
