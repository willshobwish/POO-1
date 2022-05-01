using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio05 {
    internal class Conta {
        string numero;
        string cliente;
        double saldo;
        public void setNome(string cliente) {
            this.cliente = cliente;
        }
        public void setNumero(string numero) {
            this.numero = numero;
        }
        public string exibeConta() {
            string texto = $@"Nome do cliente: {cliente}
Número da conta: {numero}
Saldo da conta: {saldo}
";
            return texto;
        }
        public void depositar(double valor) {
            saldo = saldo + valor;
        }
        public void retirar(double valor) {
            if (valor <= saldo) {
                saldo = saldo - valor;
            }
            else {
                Console.WriteLine("Não possui saldo suficiente");
            }
        }
    }
}
