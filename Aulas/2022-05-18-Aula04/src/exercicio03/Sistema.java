/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio03;

import java.util.Scanner;

/**
 *
 * @author Willian
 */
public class Sistema {

    int Operacao = 0;
    int Maximo = 100;
//    Criacao de vetores de ponteiros de objetos
    private ProdutoEstadual VetorProdutoEstadual[];
    private ProdutoNacional VetorProdutoNacional[];
    private ProdutoImportado VetorProdutoImportado[];
    private int ContadorEstadual;
    private int ContadorNacional;
    private int ContadorImportado;
    String MenuIntroducao = """
                            
                            Menu
                            1-Cadastrar produto estadual
                            2-Cadastrar produto nacional
                            3-Cadastrar produto importado
                            4-Exibir produtos estaduais
                            5-Exibir produtos nacionais
                            6-Exibir produtos importados
                            7-Exibir todos os produtos
                            9-Sair""";

    public int Menu() {
        System.out.println(MenuIntroducao);
        Scanner scan = new Scanner(System.in);
        Operacao = Integer.parseInt(scan.nextLine());
        return Operacao;
    }

    public void Executar() {
        System.out.println("Sistema de cadastro de produtos");
        VetorProdutoEstadual = new ProdutoEstadual[Maximo];
        VetorProdutoNacional = new ProdutoNacional[Maximo];
        VetorProdutoImportado = new ProdutoImportado[Maximo];
        String Descricao;
        float Valor, Imposto, Taxa, TaxaImportacao;
        Scanner scan = new Scanner(System.in);

        do {
            Operacao = Menu();
            switch (Operacao) {
//                Cadastro de produto estadual
                case 1:
                    System.out.println("Descricao do produto estadual: ");
                    Descricao = scan.nextLine();
                    System.out.println("Valor do produto: ");
                    Valor = Float.parseFloat(scan.nextLine());
                    System.out.println("Porcentagem do imposto: ");
                    Imposto = Float.parseFloat(scan.nextLine());
                    if (ContadorEstadual < Maximo) {
                        VetorProdutoEstadual[ContadorEstadual] = new ProdutoEstadual(Descricao, Valor, Imposto);
                        ContadorEstadual++;
                    } else {
                        System.out.println("Nao ha espaco no vetor");
                    }
                    break;
                case 2:
                    System.out.println("Descricao do produto nacional: ");
                    Descricao = scan.nextLine();
                    System.out.println("Valor do produto: ");
                    Valor = Float.parseFloat(scan.nextLine());
                    System.out.println("Porcentagem do imposto: ");
                    Imposto = Float.parseFloat(scan.nextLine());
                    System.out.println("Porcentagem do taxa: ");
                    Taxa = Float.parseFloat(scan.nextLine());
                    if (ContadorNacional < Maximo) {
                        VetorProdutoNacional[ContadorNacional] = new ProdutoNacional(Descricao, Valor, Imposto, Taxa);
                        ContadorNacional++;
                    } else {
                        System.out.println("Nao ha espaco no vetor");
                    }
                    break;
                case 3:
                    System.out.println("Descricao do produto importado: ");
                    Descricao = scan.nextLine();
                    System.out.println("Valor do produto: ");
                    Valor = Float.parseFloat(scan.nextLine());
                    System.out.println("Porcentagem do imposto: ");
                    Imposto = Float.parseFloat(scan.nextLine());
                    System.out.println("Porcentagem da taxa: ");
                    Taxa = Float.parseFloat(scan.nextLine());
                    System.out.println("Porcentagem da taxa de importacao: ");
                    TaxaImportacao = Float.parseFloat(scan.nextLine());
                    if (ContadorImportado < Maximo) {
                        VetorProdutoImportado[ContadorImportado] = new ProdutoImportado(Descricao, Valor, Imposto, Taxa, TaxaImportacao);
                        ContadorImportado++;
                    } else {
                        System.out.println("Nao ha espaco no vetor");
                    }
                    break;
                case 7:
                    System.out.println("Exibir todos os produtos cadastrados");
                    System.out.println("Produtos estaduais:");
                    if (ContadorEstadual > 0) {
                        for (int index = 0; index < ContadorEstadual; index++) {
                            VetorProdutoEstadual[index].Exibir();
                        }
                    } else {
                        System.out.println("Nao ha produtos estaduais cadastrados");
                    }

                    System.out.println("\nProdutos nacionais:");
                    if (ContadorNacional > 0) {
                        for (int index = 0; index < ContadorNacional; index++) {
                            VetorProdutoNacional[index].Exibir();
                        }
                    } else {
                        System.out.println("Nao ha produtos estaduais nacionais cadastrado");
                    }

                    System.out.println("\nProdutos importados:");
                    if (ContadorImportado > 0) {
                        for (int index = 0; index < ContadorImportado; index++) {
                            VetorProdutoImportado[index].Exibir();
                        }
                    } else {
                        System.out.println("Nao ha produtos estaduais importados cadastrado");
                    }

                case 9:
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        } while (Operacao != 9);
    }
}
