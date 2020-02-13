using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace WindowsFormsApp10_gyvunai
{
    
    public partial class Form1 : Form
    {
        internal List<Gyvunas> list = new List<Gyvunas>();
        
        public Form1()

        {
            InitializeComponent();            
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            Ziurkenas m = new Ziurkenas("Mikis")
            {
                UodegosIlgis = 10,
                Spalva = "baltas"
            };
            
            list.Add(m);
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Form2 f2 = new Form2(this);
            f2.ShowDialog();
        }

        private void button3_Click(object sender, EventArgs e)
        {

            foreach (Gyvunas g in list)
            {
                this.listBox1.Items.Add(g.ToString());                              
            }

            button3.Enabled = false;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Form3 f3 = new Form3(this);
            f3.ShowDialog();
        }

        private void button4_Click(object sender, EventArgs e)
        {
            listBox1.Items.Clear();

            list.Sort();

            foreach (Gyvunas g in list)
            {
                listBox1.Items.Add(g.ToString());
            }

            button4.Enabled = false;
        }

        private void button5_Click(object sender, EventArgs e)
        {
            listBox1.Items.Clear();
            
            listBox1.Items.Add(Gyvunas.SearchByName(list, textBox1.Text));
        }
    }
}
