using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace WindowsFormsApp10_gyvunai
{
    internal class Gyvunas: IComparable<Gyvunas>
    {
        private String name;
        private String type;

        public string Name { get => name; set => name = value; }
        public string Type { get => type; set => type = value; }

        public Gyvunas(string name, string type)
        {
            this.name = name;
            this.type = type;
        }          
       

        public int CompareTo(Gyvunas o)
        {
            // TODO Auto-generated method stub
            if (this.Type == o.Type)
            {
                return this.Name.CompareTo(o.Name);
            }
            return this.Type.CompareTo(o.Type);
        }

        public static string SearchByName(List<Gyvunas> list, String vardas)
        {
            int noName = 0;
            string v="";
            for (int i = 0; i < list.Count; i++)
            {
                if (list[i].Name.CompareTo(vardas) == 0)
                {
                    v+=list[i].ToString()+Environment.NewLine;
                    noName++;
                }
            }
            if (noName == 0) v="Tokio gyvuno nera sarase!";
            return v;
        }




    }
}
