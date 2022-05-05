using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2022_04_28_Aula03
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Alunos alunoTeste = new Alunos();
            alunoTeste.SetName("Alpha");
            alunoTeste.SetRA("202020202");
            alunoTeste.SetNotas(10, 8, 3, 4);
            Console.WriteLine(alunoTeste.ReturnName());
            Console.ReadLine();
        }
    }
}
