/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio02;

import java.util.Scanner;

/**
 *
 * @author Willian
 */
public class Sistema {

    private ProdutosEstaduais[] VetorProdutos;
    private int Maximo = 100;
    private String StringMenu = """
                            MENU
                            1 – Cadastrar Produto Estadual
                            2 – Cadastrar Produto Nacional
                            3 – Cadastrar Produto Importado
                            4 – Exibir Produtos Estaduais
                            5 – Exibir Produtos Nacionais
                            6 – Exibir Produtos Importados
                            7 – Exibir Todos Produtos
                            9 – SAIR
                            """;

    public int Menu() {
        Scanner scan = new Scanner(System.in);
        System.out.println(StringMenu);
        return Integer.parseInt(scan.nextLine());
    }

    public void Executar() {
        VetorProdutos = new ProdutosEstaduais[Maximo];
        int Quantidade = 0, Operacao;
        String Descricao;
        float Valor, Imposto, Taxa, TaxaImportacao;
        Scanner scan = new Scanner(System.in);
        do {
            Operacao = Menu();
            switch (Operacao) {
                case 1:
                    System.out.println("Cadastro de produto Estadual");
                    System.out.println("Digite a descricao: ");
                    Descricao = scan.nextLine();
                    System.out.println("Digite o valor: ");
                    Valor = Float.parseFloat(scan.nextLine());
                    System.out.println("Digite o imposto: ");
                    Imposto = Float.parseFloat(scan.nextLine());
                    VetorProdutos[Quantidade] = new ProdutosEstaduais(Descricao, Valor, Imposto);
                    Quantidade++;
                    break;
                case 2:
                    System.out.println("Cadastro de produto Nacional");
                    System.out.println("Digite a descricao: ");
                    Descricao = scan.nextLine();
                    System.out.println("Digite o valor: ");
                    Valor = Float.parseFloat(scan.nextLine());
                    System.out.println("Digite o imposto: ");
                    Imposto = Float.parseFloat(scan.nextLine());
                    System.out.println("Digite a taxa: ");
                    Taxa = Float.parseFloat(scan.nextLine());
                    VetorProdutos[Quantidade] = new ProdutosNacionais(Descricao, Valor, Imposto, Taxa);
                    Quantidade++;
                    break;
                case 3:
                    System.out.println("Cadastro de produto Importado");
                    System.out.println("Digite a descricao: ");
                    Descricao = scan.nextLine();
                    System.out.println("Digite o valor: ");
                    Valor = Float.parseFloat(scan.nextLine());
                    System.out.println("Digite o imposto: ");
                    Imposto = Float.parseFloat(scan.nextLine());
                    System.out.println("Digite a taxa: ");
                    Taxa = Float.parseFloat(scan.nextLine());
                    System.out.println("Digite a taxa de importacao: ");
                    TaxaImportacao = Float.parseFloat(scan.nextLine());
                    VetorProdutos[Quantidade] = new ProdutosImportados(Descricao, Valor, Imposto, Taxa, TaxaImportacao);
                    Quantidade++;
                    break;
                case 4:
                    for (int index = 0; index < Quantidade; index++) {
                        if (VetorProdutos[index] instanceof ProdutosEstaduais) {
                            VetorProdutos[index].Exibir();
                        }
                    }
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    for (int index = 0; index < Quantidade; index++) {
                        VetorProdutos[index].Exibir();
                    }
                    break;
                default:
                    System.out.println("Operacao invalida, digite novamente");
            }
        } while (Operacao != 9);
    }
}
