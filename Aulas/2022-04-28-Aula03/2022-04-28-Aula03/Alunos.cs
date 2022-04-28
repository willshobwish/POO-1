using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _2022_04_28_Aula03
{
    internal class Alunos
    {
        string name;
        string RA;
        float nota1, nota2, nota3, nota4;
        public void SetName(string name)
        {
            this.name = name;
        }
        public void SetRA(string RA)
        {
            this.RA = RA;
        }
        public void SetNotas(float nota1, float nota2, float nota3, float nota4)
        {
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.nota3 = nota3;
            this.nota4 = nota4;
        }
    }
}
