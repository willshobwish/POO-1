package exercicio02;

// Uma academia mantem registro de seus alunos armazenando nome, idade, peso e altura. A
// academia faz um desconto especial para menores de idade, portanto, é necessário saber
// distinguir entre um aluno maior e menor. Além disso, a academia também tem interesse em
// acompanhar o desempenho de seus alunos, por isso, ela também necessita conhecer o índice
// de massa corporal (IMC) deles, sendo que o IMC = peso / altura ^ 2.

public class Main {
    public static void main(String[] args) {
        Academia aluno = new Academia();
        aluno.setDados("Alpha", 18, 80, 1.8f);
        if (aluno.getMenorDeIdade()) {
            System.out.println("Menor de idade");
        } else {
            System.out.println("Maior de idade");
        }
        System.out.println("O IMC do aluno é: " + aluno.imc());
    }
}
