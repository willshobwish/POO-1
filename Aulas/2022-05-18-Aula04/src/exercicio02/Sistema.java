/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio02;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author Willian
 */
public class Sistema {

    private ContaCorrente VetorContas[];
    private int Maximo = 100;
    private int Contador = 0;
    private String MenuString = """

                 MENU
                 1 – Cadastrar Nova Conta
                 2 – Saque
                 3 – Depósito
                 4 – Listar Contas (posição do vetor e nome dos clientes)
                 5 – Relatório Geral (todas as contas)
                 6 – Relatório de Contas cujo saldo está abaixo de zero
                 7 – Relatório da Conta de um determinado cliente
                 9 – Sair
                 """;

    public int Menu() {
        Scanner Scan = new Scanner(System.in);
        System.out.println(MenuString);
        return Integer.parseInt(Scan.nextLine());
    }

    private ContaCorrente Buscar(String Numero) {
        for (int index = 0; index < Contador; index++) {
            if (VetorContas[index].getNumero().equals(Numero)) {
                return VetorContas[index];
            }

        }
        return null;
    }

    public void Executar() {
        int Operacao;
        String Numero, Titular;
        double Saldo, LimiteDaConta;

        VetorContas = new ContaCorrente[Maximo];

        Scanner scan = new Scanner(System.in);

        do {
            Operacao = Menu();
            switch (Operacao) {
                case 1:
                    if (Contador < Maximo) {
                        System.out.println("Digite o numero da conta: ");
                        Numero = scan.nextLine();
                        System.out.println("Digite o titular da conta: ");
                        Titular = scan.nextLine();
                        System.out.println("Digite o saldo da conta: ");
                        Saldo = Double.parseDouble(scan.nextLine());
                        System.out.println("Digite o limte de saldo da conta: ");
                        LimiteDaConta = Double.parseDouble(scan.nextLine());
                        VetorContas[Contador] = new ContaCorrente(Numero, Titular, Saldo, LimiteDaConta);
                        Contador++;
                    } else {
                        System.out.println("Nao ha espaco no vetor para a criacao de contas");
                    }
                    break;

//                    Arrumar o caso 2, que busca o numero da conta para fazer o saque
                case 2:
                    System.out.println("Digite o numero da conta: ");
                    Numero = scan.nextLine();
                    ContaCorrente busca = Buscar(Numero);
                    if (busca != null) {
                        System.out.println("");
                    }
                    break;

//                    Arrumar o caso 3, que busca o numero da conta para fazer o deposito
                case 3:
                    break;

                case 4:
                    for (int index = 0; index < Contador; index++) {
                        System.out.println("Posicao da conta: " + index + "\nTitular: " + VetorContas[index].getTitular() + "\n");
                    }
                    break;

                case 5:
                    for (int index = 0; index < Contador; index++) {
                        System.out.println("Numero da conta: ");
                        System.out.println(VetorContas[index].getNumero());
                        System.out.println("Titular da conta: ");
                        System.out.println(VetorContas[index].getTitular());
                        System.out.println("Saldo da conta: ");
                        System.out.println(VetorContas[index].getSaldo());
                        System.out.println("Limite da conta: ");
                        System.out.println(VetorContas[index].getLimiteDaConta());
                        System.out.println("");
                    }
                    break;

                case 6:

                    break;

                case 7:

                    break;
                case 9:
                    break;

                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        } while (Operacao != 9);
    }
}
