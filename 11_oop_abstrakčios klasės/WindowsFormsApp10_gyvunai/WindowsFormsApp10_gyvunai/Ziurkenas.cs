using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WindowsFormsApp10_gyvunai
{
    internal class Ziurkenas : Gyvunas
    {
        private int uodegosIlgis;
        private String spalva;

        public int UodegosIlgis { get => uodegosIlgis; set => uodegosIlgis = value; }
        public string Spalva { get => spalva; set => spalva = value; }

        public Ziurkenas(String name) : base(name, "ziurkenas") {}

        public override string ToString()
        {
            return $"Gyvunas: {Type}, vardas: {Name}, uodegos ilgis: {uodegosIlgis}, " +
                $"spalva: {spalva}";
        }
    }
}
