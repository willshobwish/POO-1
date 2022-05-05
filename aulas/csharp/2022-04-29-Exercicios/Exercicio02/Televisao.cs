using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Exercicio02 {
    internal class Televisao {
        int canal;
        int volume;
        bool ligada;
        public string getStatusTelevisao() {
            string status = $@"Canal: {canal}
Volume: {volume}
Ligada: {ligada}";
            return status;
        }
        public void aumentarCanal() {
            this.canal += 1;
        }
        public void diminuirCanal() {
            this.canal -= 1;

        }
        public void aumentarVolume() {
            this.volume += 1;
        }
        public void diminuirVolume() {
            this.volume -= 1;
        }
        public void desligar() {
            this.ligada = false;
        }
        public void ligar() {
            this.ligada = true;
        }
        public void SetCanal(int canal) {
            this.canal = canal;
        }
    }
}
