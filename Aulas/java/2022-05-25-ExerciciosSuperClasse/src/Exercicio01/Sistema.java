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
public class Sistema {

    private Peca VetorPeca[] = new Peca[100];

    public void Executar() {
        System.out.println("Sistema de pecas");
        System.out.println(Menu());

    }

    public int Menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("""
                           aaaaa
                           """);
        return Integer.parseInt(scan.nextLine());
    }
}
