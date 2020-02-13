using System;
using System.Collections.Generic;
using System.Text;

namespace ConsoleApp7
{
    class Point
    {
		private int x;
		private int y;			
		
		public Point(int x, int y)
		{
			this.x = x;
			this.y = y;
		}
		
		//x get and set
		public int X
		{
			get
			{
				return this.x;
			}
			set
			{
				this.x = value;
			}
		}
		//y get and set
		public int Y
		{
			get
			{
				return this.y;
			}
			set
			{
				this.y = value;
			}
		}
			   
		public double DistanceFromOrigin()
		{
			return Math.Sqrt(this.x * this.x + this.y * this.y);
		}
		
		public void Translate(int dx, int dy)
		{
			this.x += dx;
			this.y += dy;
		}
		
		public double Distance(Point p)
		{
			double xdif = this.x - p.X;
			double ydif = this.y - p.Y;
			return Math.Sqrt(xdif * xdif + ydif * ydif);
		}
		
		void SetLocation(int x, int y)
		{
			this.x = x;
			this.y = y;
		}

		public string ToStrings()
		{
			return "[" + this.x.ToString() + ";" + this.y.ToString() + "]";
		}	
		
		
	}
}
