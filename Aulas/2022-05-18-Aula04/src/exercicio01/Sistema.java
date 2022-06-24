/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio01;

import java.util.Scanner;

/**
 *
 * @author Willian
 */
public class Sistema {

    private int Maximo = 100;
    private Alunos AlunosVetor[];
    private int Contador = 0;

    private int menu() {
        String MenuString = "MENU\n"
                + "1 – Cadastrar Aluno\n"
                + "2 – Listar Alunos (somente nome)\n"
                + "3 – Relatório Geral (exibe todas as informações)\n"
                + "4 – Informações de um Aluno\n"
                + "5 – IMC maior que um valor\n"
                + "9 – Sair\n";
        System.out.println(MenuString);
        System.out.println("Digite uma opcao: ");
        Scanner scan = new Scanner(System.in);
        int operation = Integer.parseInt(scan.nextLine());
        return operation;
    }

    public void execute() {
        System.out.println("Sistema: academia");
        int Operation;
        AlunosVetor = new Alunos[Maximo];
//        Variaveis para o scanner alocar
        String Identificacao;
        String Nome;
        int Idade;
        float Peso;
        float Altura;
//        Criação do objeto scanner
        Scanner scan = new Scanner(System.in);
        do {
            Operation = menu();
            switch (Operation) {
                case 1:
                    if (Contador < Maximo) {
                        System.out.println("Coloque as informações necessárias");
                        System.out.println("Identificador do aluno: ");
                        Identificacao = scan.nextLine();
                        System.out.println("Nome do aluno: ");
                        Nome = scan.nextLine();
                        System.out.println("Idade do aluno: ");
                        Idade = Integer.parseInt(scan.nextLine());
                        System.out.println("Peso do aluno: ");
                        Peso = Float.parseFloat(scan.nextLine());
                        System.out.println("Altura do aluno: ");
                        Altura = Float.parseFloat(scan.nextLine());
                        AlunosVetor[Contador] = new Alunos(Identificacao, Nome, Idade, Peso, Altura);
                        Contador++;
                    } else {
                        System.out.println("Não há espaço no vetor");
                    }
                    break;
                case 2:
                    if (Contador > 0) {
                        System.out.println("Alunos cadastrados: ");
                        for (int index = 0; index < Contador; index++) {
                            System.out.println(index + 1 + " - " + AlunosVetor[index].getNome());
                        }
                    } else {
                        System.out.println("Nao ha alunos cadastrados");
                    }
                    break;
                case 3:
                    if (Contador > 0) {
                        for (int index = 0; index < Contador; index++) {
                            AlunosVetor[index].exibir();
                        }
                    } else {
                        System.out.println("Nao ha alunos cadastrados");
                    }
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        } while (Operation != 9);
    }
}
