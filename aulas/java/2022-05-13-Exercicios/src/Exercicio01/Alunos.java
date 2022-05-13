/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio01;

/**
 *
 * @author Willian
 */
public class Alunos {

    private String identificador;
    private String nome;
    private int idade;
    private float peso;
    private float altura;

    public void setIdentificador(String identificador) {
        System.out.println("Digite o identificador: ");
        this.identificador = identificador;
    }

    public void setNome(String nome) {
        System.out.println("Digite o nome: ");
        this.nome = nome;
    }

    public void setIdade(int idade) {
        System.out.println("Digite a idade: ");
        this.idade = idade;
    }

    public void setPeso(float peso) {
        System.out.println("Digite o peso: ");
        this.peso = peso;
    }

    public void setAltura(float altura) {
        System.out.println("Digite a altura: ");
        this.altura = altura;
    }

    public Alunos() {

    }

    public Alunos(String identificador, String nome, int idade, float peso, float altura) {
        System.out.println("Digite o identificador: ");
        this.identificador = identificador;
        System.out.println("Digite o nome: ");
        this.nome = nome;
        System.out.println("Digite a idade: ");
        this.idade = idade;
        System.out.println("Digite o peso: ");
        this.peso = peso;
        System.out.println("Digite a altura: ");
        this.altura = altura;
    }

    public void exibir() {
        System.out.println(identificador);
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(peso);
        System.out.println(altura);
    }
    
    public float CalcularIMC(){
        return peso/(altura*altura);
    }
}
