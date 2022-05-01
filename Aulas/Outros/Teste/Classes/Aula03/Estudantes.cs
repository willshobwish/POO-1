using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Classes {
    class Estudantes {
        string nome;
        float nota1;
        float nota2;
        public float Media() {
            return (nota1 + nota2) / 2;
        }
        public void ColocaNota() {
            Console.Write("Coloque a primeira nota do aluno: ");
            float entradaPrimeiraNota = Convert.ToInt32(Console.ReadLine());
            if (entradaPrimeiraNota >= 0 & entradaPrimeiraNota <= 10) {
                this.nota1 = entradaPrimeiraNota;
            }
            else {
                Console.WriteLine("O nota inserido esta fora do intervalo: " + entradaPrimeiraNota);
            }
            Console.Write("Coloque a segunda nota do aluno: ");
            float entradaSegundaNota = Convert.ToInt32(Console.ReadLine());
            if (entradaSegundaNota >= 0 & entradaSegundaNota <= 10) {
                this.nota2 = entradaSegundaNota;
            }
            else {
                Console.WriteLine("O nota inserido esta fora do intervalo: " + entradaSegundaNota);
            }
        }
    }
}

