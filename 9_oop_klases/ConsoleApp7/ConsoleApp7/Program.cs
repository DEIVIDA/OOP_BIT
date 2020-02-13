using System;

namespace ConsoleApp7
{
    class Program
    {
        static void Main(string[] args)
        {
            Point p1 = new Point(3, 1);
            Point p2 = new Point(5, 1);

            Console.WriteLine(p1.ToStrings());
            Console.WriteLine(p2.ToStrings());
            Console.WriteLine("p1 distance from origin:"+p1.DistanceFromOrigin());
            p2.Translate(2, 1);

            Console.WriteLine("p2 distance from p1:" + p1.Distance(p2));

            Line l1 = new Line(p1, p2);

            Console.WriteLine(l1.ToStrings());
            Console.WriteLine("Line lenght: " + l1.lineLenght());
        }
    }
}
