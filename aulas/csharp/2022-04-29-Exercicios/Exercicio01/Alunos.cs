using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2022_04_29_POO_Exercicios {
    internal class Alunos {
        string nome;
        string RA;
        float trabalho1;
        float trabalho2;
        float prova1;
        float prova2;

        public void SetNome(string nome){ 
            this.nome = nome;
        }

        public float calcularMedia() {
            float media = (this.trabalho1 + this.trabalho2 + this.prova1 + this.prova2) / 4;
            return media;
        }
        public bool Aprovado() {
            if (calcularMedia() >= 5) {
                return true;
            }
            else {
                return false;
            }
        }
        public void SetNotas(float trabalho1, float trabalho2, float prova1, float prova2) {
            if (trabalho1 >= 0 && trabalho1 <= 10) {
                this.trabalho1 = trabalho1;

            }
            else {
                Console.WriteLine("Nota fora do intervalo");
            }
            if (trabalho2 >= 0 && trabalho2 <= 10) {
                this.trabalho2 = trabalho2;

            }
            else {
                Console.WriteLine("Nota fora do intervalo");
            }
            if (prova1 >= 0 && prova1 <= 10) {
                this.prova1 = prova1;

            }
            else {
                Console.WriteLine("Nota fora do intervalo");
            }
            if (prova2 >= 0 && prova2 <= 10) {
                this.prova2 = prova2;

            }
            else {
                Console.WriteLine("Nota fora do intervalo");
            }

        }
        public string Nome() {
            return this.nome;
        }
    }
}
