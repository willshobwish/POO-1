using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2022_04_29_POO_Exercicios {
    internal class Program {
        static void Main(string[] args) {
            Alunos AlunoTeste = new Alunos();
            AlunoTeste.SetNome("Alpha");
            AlunoTeste.SetNotas(10, 2, 6, 5);
            Console.WriteLine("O aluno " + AlunoTeste.Nome() + " possui a média " + AlunoTeste.calcularMedia());
            if (AlunoTeste.Aprovado()) {
                Console.WriteLine("O aluno " + AlunoTeste.Nome() + " está aprovado");
            }
            Console.ReadLine();
        }
    }
}
