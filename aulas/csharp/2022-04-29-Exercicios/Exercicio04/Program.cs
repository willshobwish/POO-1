using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio04 {
    internal class Program {
        static void Main(string[] args) {
            Academia Aluno = new Academia();
            Aluno.setDados("Teste", 17, 87, 189);
            Console.WriteLine(Aluno.imc());
            Console.ReadLine();
        }
    }
}
