/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio01;

import java.util.Scanner;

/**
 *
 * @author Willian
 */
public class Pessoa {

    private String Nome;
    Scanner Scan = new Scanner(System.in);
    private Contato Contatos[];

//Numero maximo de contatos disponiveis para armazenar
    private int Maximo;

//Contador para saber onde que esta no vetor de ponteiros
    private int Contador = 0;

//    Construtor de pessoas
    public Pessoa(String Nome, int Maximo) {
        this.Nome = Nome;
        this.Maximo = Maximo;
        Contatos = new Contato[Maximo];
    }

    public void AdicionarContato(Contato PessoaContato) {
        if (Contador < Maximo) {
            Contatos[Contador] = PessoaContato;
            Contador++;
        } else {
            System.out.println("Nao ha espaco");
        }
    }

    public Contato[] GetContatos() {
        return Contatos;
    }
}
