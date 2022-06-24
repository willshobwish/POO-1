package exercicio02;

import java.lang.Math;

// Uma academia mantem registro de seus alunos armazenando nome, idade, peso e altura. A
// academia faz um desconto especial para menores de idade, portanto, é necessário saber
// distinguir entre um aluno maior e menor. Além disso, a academia também tem interesse em
// acompanhar o desempenho de seus alunos, por isso, ela também necessita conhecer o índice
// de massa corporal (IMC) deles, sendo que o IMC = peso / altura ^ 2.

public class Academia {
    private String nome;
    private int idade;
    private float peso;
    private float altura;

    public void setDados(String nome, int idade, float peso, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public boolean getMenorDeIdade() {
        if (idade < 18) {
            return true;
        } else {
            return false;
        }
    }

    public float imc() {
        return peso / (altura * altura);
    }
}
