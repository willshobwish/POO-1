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
public class Agenda {

    Scanner Scan = new Scanner(System.in);
    private String NomeProprietario;
    private Pessoa Pessoas[];
    private int Maximo, Contador = 0;

    public Agenda(String NomeProprietario, int Maximo) {
        this.NomeProprietario = NomeProprietario;
        this.Maximo = Maximo;
    }

    public void AddPessoa() {
        System.out.println("Digite o nome da pessoa: ");
        String Nome = Scan.nextLine();

    }
}
