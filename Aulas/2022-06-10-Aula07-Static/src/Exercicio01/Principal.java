/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio01;

/**
 *
 * @author Willian
 */
//1) Desenvolva uma classe com alguns métodos static para uso geral. Os métodos que deverão ser desenvolvidos nessa classe são:
//public class Utilidade{
//public static float media(float vet[]) //calcula a media dos elementos do vetor
//public static float soma(float vet[]) //calcula a soma dos elementos do vetor
//public static float maior(float vet[]) //encontra o maior dos elementos do vetor
//public static float menor(float vet[]) //encontra o menor dos elementos do vetor
//public static int max(int A, int B)//retorna o maior elemento da comparação entre A e B
public class Principal {

    public static void main(String[] args) {
        float teste[] = {10, 20, 30, 40, 50};
        int a = 10, b = 20;
        System.out.println("Media: " + Utilidade.media(teste));
        System.out.println("Soma: " + Utilidade.soma(teste));
        System.out.println("Maior: " + Utilidade.maior(teste));
        System.out.println("Menor: " + Utilidade.menor(teste));
        System.out.println("Maximo: " + Utilidade.maximo(a, b));
    }
}
