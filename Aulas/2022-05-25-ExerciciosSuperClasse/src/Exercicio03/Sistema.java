/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio03;

import java.util.Scanner;

/**
 *
 * @author Willian
 */
public class Sistema {

    private Universidade[] VetorUniversidade;
    private int Maximo = 1000;
    private String StringMenu = """
                            1 - Cadastrar Departamento
                            2 - Cadastrar Funcionario Tecnico
                            3 - Cadastrar Funcionario Docente
                            4 - Buscar Departamento por Nome
                            5 - Buscar Funcionario por Nome
                            6 - Listar Departamentos com Funcionarios com Faixa Salarial Especifica
                            7 - Listar Funcionarios com Faixa Salarial Especifica
                            8 - Listar Departamentos cujo gasto total esta entre uma Faixa de Valores Especifica
                            9 - Listar todos Funcionarios da Universidade
                            10 - Listar todos Departamentos da Universidade
                            11 - Listar todos Departamentos da Universidade e seus Respectivos Funcionarios
                            12 - Listar todos Funcionarios Docente
                            13 - Listar todos Funcionarios Tecnico
                            0 - Sair
                            """;

    public int Menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println(StringMenu);
        return Integer.parseInt(scan.nextLine());
    }

    public void Executar() {
        VetorUniversidade = new Universidade[Maximo];
        String Codigo, Nome;
        float Salario;
        int Operacao, Contador = 0;
        Scanner scan = new Scanner(System.in);
        do {
            Operacao = Menu();
            switch (Operacao) {
                case 1:
                    if (Contador < Maximo) {
                        System.out.println("Digite o codigo do departamento: ");
                        Codigo = scan.nextLine();
                        System.out.println("Digite o nome do departamento: ");
                        Nome = scan.nextLine();
                        VetorUniversidade[Contador] = new Departamento(Codigo, Nome);
                        Contador++;
                    } else {
                        System.out.println("Limite atingido");
                    }
                    break;
                case 2:
                    if (Contador < Maximo) {
                        System.out.println("cadastro de funcionario tecnico");
                        System.out.println("Digite o codigo do funcionario: ");
                        Codigo = scan.nextLine();
                        System.out.println("Digite o nome do funcionario: ");
                        Nome = scan.nextLine();
                        System.out.println("Digite o salario: ");
                        Salario = Float.parseFloat(scan.nextLine());
                        VetorUniversidade[Contador] = new FuncionarioTecnico(Codigo, Nome, Salario);
                        Contador++;
                    } else {
                        System.out.println("Limite atingido");
                    }
                    break;
                case 3:
                    if (Contador < Maximo) {
                        System.out.println("cadastro de funcionario docente");
                        System.out.println("Digite o codigo do funcionario: ");
                        Codigo = scan.nextLine();
                        System.out.println("Digite o nome do funcionario: ");
                        Nome = scan.nextLine();
                        System.out.println("Digite o salario: ");
                        Salario = Float.parseFloat(scan.nextLine());
                        VetorUniversidade[Contador] = new FuncionarioDocente(Codigo, Nome, Salario);
                        Contador++;
                    } else {
                        System.out.println("Limite atingido");
                    }
                    break;
//                case 1:
//
//                    break;
//                case 1:
//
//                    break;
//                case 1:
//
//                    break;
//                case 1:
//
//                    break;
//                case 1:
//
//                    break;
//                case 1:
//
//                    break;
//                case 1:
//
//                    break;
//                case 1:
//
//                    break;
//                case 1:
//
//                    break;
//                case 1:
//
//                    break;
//                case 1:
//
//                    break;
//                case 1:
//
//                    break;

                default:
                    System.out.println("Operacao invalida, digite novamente");
                    break;

            }

        } while (Operacao != 0);

    }
}
