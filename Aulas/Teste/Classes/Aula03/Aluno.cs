using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Classes.Aula03 {
    internal class Aluno {
        //Encapsulamento para evitar inconsistencias no codigo
        //Definicao de privado para nao ter acesso direto
        private string RA;
        private string nome;
        private float nota1, nota2, nota3, nota4;

        public float media() {
            float m = 0;
            m = (nota1 + nota2 + nota3 + nota4)/4;
            return m;
        }

        public bool aprovado() {
            if (media() >= 5) {
                return true;
            }
            else {
                return false;
            }
        }


        public void SetRA(string RA) {
            this.RA = RA;
        }
        public void SetNome(string nome) {
            this.nome = nome;
        }
        public void SetNota1(float nota1) {
            this.nota1 = nota1;
        }
        public void SetNota2(float nota2) {
            this.nota2 = nota2;
        }

        public void SetNota3Nota4(float nota3, float nota4) {
            this.nota3 = nota3;
            this.nota4 = nota4;
        }
    }
}
