/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio01;

/**
 *
 * @author Willian
 */
public class Pessoa {

    private Contato Contatos[];
    private String Nome;

//Numero maximo de contatos disponiveis para armazenar
    private int Maximo = 0;

//Contador para saber onde que esta no vetor de ponteiros
    private int Contador = 0;

    public Pessoa(String Nome, int Maximo) {
        this.Nome = Nome;
        this.Maximo = Maximo;
    }

}
