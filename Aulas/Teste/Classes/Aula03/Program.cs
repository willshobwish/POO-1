using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Classes.Aula03{
    class Program {
        static void Main(string[] args) {
            /*Livro Livronovo = new Livro("Nome do livro", "Nome do autor", 2022, 200);
            Livro Livro2 = new Livro("Qualquer nome", "Qualquer autor", 2021, 300);
            Livro livro3 = new Livro("Outro livro", "Outro autor", 2023, 403);
            Estudantes estudante1 = new Estudantes();
            estudante1.ColocaNota();
            Console.WriteLine("A media do aluno: " + estudante1.Media());
            Console.ReadLine();*/
            Aluno a1 = new Aluno();
            a1.SetRA("1111");
            a1.SetNome("Alpha");
            a1.SetNota1(5);
            a1.SetNota2(2);
            a1.SetNota3Nota4(9, 2);
            a1.aprovado();
            Console.WriteLine(a1.media());
            Console.WriteLine(a1.aprovado());
            Console.ReadLine();
            //Quando o objeto existe, eh possivel acessar o 
        }
    }
}
