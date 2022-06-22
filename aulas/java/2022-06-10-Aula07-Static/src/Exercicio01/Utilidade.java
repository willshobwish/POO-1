/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio01;

/**
 *
 * @author Willian
 */
public class Utilidade {

    public static float media(float vetor[]) {
        float soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return soma / vetor.length;
    }

    public static float soma(float vetor[]) {
        float soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return soma;
    }

    public static float maior(float vetor[]) {
        float temp, maior = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            temp = vetor[i];
            if (temp > maior) {
                maior = temp;
            }
        }
        return maior;
    }

    public static float menor(float vetor[]) {
        float temp, menor = vetor[0];
        for (int i = 0; i < vetor.length; i++) {
            temp = vetor[i];
            if (temp < menor) {
                menor = temp;
            }
        }
        return menor;
    }

    public static int maximo(int A, int B) {
        if (A > B) {
            return A;
        } else {
            return B;
        }
    }
}
