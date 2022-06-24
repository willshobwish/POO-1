/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Teste;

import java.util.Scanner;

/**
 *
 * @author Willian
 */
public class Main {

    public static void main(String[] args) {

        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um texto:");
        while (sc.hasNext()) {
            i++;
            System.out.println("Token: " + sc.next());
        }
        sc.close(); //Encerra o programa
    }
}
