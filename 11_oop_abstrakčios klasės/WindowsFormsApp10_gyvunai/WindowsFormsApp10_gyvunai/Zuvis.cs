using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WindowsFormsApp10_gyvunai
{
    internal class Zuvis : Gyvunas
    {
        private int pelekuKiekis;

        public int PelekuKiekis { get => pelekuKiekis; set => pelekuKiekis = value; }

        public Zuvis(String name) : base(name, "zuvis") { }

        public override string ToString()
        {
            return $"Gyvunas: {Type}, vardas: {Name}, peleku kiekis: {PelekuKiekis}";
        }
    }
}
