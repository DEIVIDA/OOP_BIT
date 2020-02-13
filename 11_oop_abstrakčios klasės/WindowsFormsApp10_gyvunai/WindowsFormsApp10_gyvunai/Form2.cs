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
    public partial class Form2 : Form
    {
        //Attibute for Form1 object
        readonly Form1 f1;

        public Form2(Form1 frm1)
        {
            InitializeComponent();
            this.f1 = frm1;
        }

        private void Form2_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            String name = textBox1.Text;
            String color = textBox2.Text;
            int tail = int.Parse(textBox3.Text);
            
            Ziurkenas z = new Ziurkenas(name)
            {
                UodegosIlgis = tail,
                Spalva = color
            };

            f1.list.Add(z);

            textBox1.Text = "";
            textBox2.Text = "";
            textBox3.Text = "";
        }
               
        private void button2_Click(object sender, EventArgs e)
        {
            Close();
        }
    }
}
