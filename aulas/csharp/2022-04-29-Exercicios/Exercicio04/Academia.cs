using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio04 {
    internal class Academia {
        string nome;
        int idade;
        double peso;
        double altura;
        public bool isMenor() {
            if (this.idade < 18) {
                return true;
            }
            else {
                return false;
            }
        }
        public void setDados(string nome, int idade, double peso, double altura) {
            this.nome = nome;
            this.idade = idade;
            this.peso = peso;
            this.altura = altura;
        }
        public double imc() {
            double calculoImc = peso / (Math.Pow(altura, 2));
            return calculoImc;
        }
    }
}
