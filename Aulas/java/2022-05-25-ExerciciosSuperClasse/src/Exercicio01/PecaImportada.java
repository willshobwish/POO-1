/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio01;

/**
 *
 * @author Willian
 */
public class PecaImportada extends Peca {

    private float TaxaImportacao;
    private float TaxaFrete;

//    Construtor sem parametros
    public PecaImportada() {
    }

//    Construtor com parametros
    public PecaImportada(float TaxaImportacao, float TaxaFrete, String Nome, float Custo, float Lucro) {
//        Referencia ao construtor da super classe
        super(Nome, Custo, Lucro);
        this.TaxaImportacao = TaxaImportacao;
        this.TaxaFrete = TaxaFrete;
    }

    @Override
    public void Exibir() {
        System.out.println("Nome: " + Nome);
        System.out.println("Custo: " + Custo);
        System.out.println("Lucro: " + Lucro);
        System.out.println("Taxa do frete: " + TaxaFrete);
        System.out.println("Taxa de importacao: " + TaxaImportacao);

    }
}
