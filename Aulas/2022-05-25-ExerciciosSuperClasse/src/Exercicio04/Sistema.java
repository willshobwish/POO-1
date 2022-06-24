/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio04;

import java.util.Scanner;

/**
 *
 * @author Willian
 */
public class Sistema {

    private String MenuString = """
                            1 - Inserir um número;
                            2 - Remover um número;
                            3 - Informar a quantidade de números armazenados;
                            4 - Informar o valor armazenado em uma posição específica, a qual é fornecida pela classe.
                            5 - Exibir os elementos armazenados na lista.
                            9 - Sair
                            """;

    public int MenuOperacao() {
        System.out.println(MenuString);
        Scanner scan = new Scanner(System.in);
        return Integer.parseInt(scan.nextLine());
    }

    public void Executar() {
        int Contador = 0, Limite = 1000, Operacao;
        do {
            Operacao = MenuOperacao();
            switch (Operacao) {
                case 1:
                    System.out.println("Insira um numero: ");

                    break;
                default:
                    throw new AssertionError();
            }
        } while (Operacao != 9);

    }
}
