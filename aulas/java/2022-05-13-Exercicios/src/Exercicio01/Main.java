/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicio01;

import java.util.Scanner;

/**
 *
 * @author Willian
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
        int option = 0, index = 0;
        String NomeDaClasse;
        Alunos ArrayAluno[] = new Alunos[10];
        while (option != 9) {
            System.out.println("MENU");
            System.out.println("1 - Cadastrar aluno");
            System.out.println("2 - Listar alunos");
            System.out.println("3 - Relatorio geral");
            System.out.println("9 - Sair");
            option = read.nextInt();
            if (option == 1) {
                ArrayAluno[index] = new Alunos(read.nextLine(),read.nextLine(),read.nextInt(),read.nextInt(),read.nextInt());
                ++index;
            }
            if (option == 2) {
                
            }
        }

    }

}
