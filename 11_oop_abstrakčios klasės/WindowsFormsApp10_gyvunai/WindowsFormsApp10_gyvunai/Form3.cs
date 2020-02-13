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
    public partial class Form3 : Form
    {
        Form1 f1;

        public Form3(Form1 frm1)
        {
            InitializeComponent();
            this.f1 = frm1;
        }

        private void Form3_Load(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            String name = textBox1.Text;            
            int tail = int.Parse(textBox2.Text);

            Zuvis zv = new Zuvis(name)
            {
                PelekuKiekis = tail,                
            };

            f1.list.Add(zv);

            textBox1.Text = "";
            textBox2.Text = "";           
        }

        private void button2_Click(object sender, EventArgs e)
        {
            Close();
        }
    }
}
