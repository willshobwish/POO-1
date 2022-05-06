package exercicio01;

public class Main {
    public static void main(String[] args) {
        Aluno alunoteste = new Aluno();
        alunoteste.setNotas(9, 8, 7, 6);
        System.out.println(alunoteste.media());
        if (alunoteste.media() >= 5) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }

}
