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

public class Main {
    public static void main(String[] args) {
        Hora horario = new Hora(10, 20, 30);
        horario.exibir();
        System.out.println(horario.converteSegundo());
    }

}
