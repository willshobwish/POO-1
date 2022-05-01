using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio05 {
    internal class Program {
        static void Main(string[] args) {
            Conta contaTeste = new Conta();
            contaTeste.setNome("Alpha");
            contaTeste.setNumero("054574389678937689");
            Console.WriteLine(contaTeste.exibeConta());
            contaTeste.depositar(1000);
            Console.WriteLine(contaTeste.exibeConta());
            contaTeste.retirar(900);
            Console.WriteLine(contaTeste.exibeConta());
            contaTeste.retirar(900);
            Console.WriteLine(contaTeste.exibeConta());
            Console.ReadLine();
        }
    }
}
