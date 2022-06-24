package exercicio04;

// Implemente uma classe que represente um horário.
// Os atributos são: hora, minuto e segundo.
// Os métodos são:
// · Um construtor sem parâmetros e um construtor com parâmetros
// · Um método get e um método set para cada atributo
// · Um método para exibir os valores dos atributos no seguinte formato
// hora:minuto:segundos – Exemplo: 19:45:43
// - Método: void exibir()
// · Um método para retornar o valor da hora em segundos. Por exemplo: 1:30:10 tem 1h*3600s
// + 30min*60s + 10s que resulta em 5410 segundos
// - Método: int calcularSegundos( )

public class Hora {
    private int hora, minuto, segundo;

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    // public Hora() {

    // }

    public Hora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void exibir() {
        System.out.println(hora + ":" + minuto + ":" + segundo);
    }

    public int converteSegundo() {
        return hora * 3600 + minuto * 60 + segundo;
    }
}
