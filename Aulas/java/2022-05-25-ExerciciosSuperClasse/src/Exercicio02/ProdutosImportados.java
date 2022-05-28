/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio02;

/**
 *
 * @author Willian
 */
public class ProdutosImportados extends Produtos {

    protected float Imposto;
    protected float Taxa;
    protected float TaxaImportacao;

//    Construtor sem parametros
    public ProdutosImportados() {
    }

//Construtor com parametros
    public ProdutosImportados(String Descricao, float Valor, float Imposto, float Taxa, float TaxaImportacao) {
        super(Descricao, Valor);
        this.Imposto = Imposto;
        this.TaxaImportacao = TaxaImportacao;
    }

//    Exibicao de atributos
    public void Exibir() {
        System.out.println("Tipo de produto: Importado");
        System.out.println("Descricao: " + Descricao);
        System.out.println("Valor: " + Valor);
        System.out.println("Imposto: " + Imposto);
        System.out.println("Taxa: " + Taxa);
        System.out.println("Taxa de importacao: " + TaxaImportacao);
        System.out.println("");
    }

//    Getter
    public float getTaxaImportacao() {
        return TaxaImportacao;
    }

    public String getDescricao() {
        return Descricao;
    }

    public float getValor() {
        return Valor;
    }

    public float getImposto() {
        return Imposto;
    }

//    Setter
    public void setTaxaImportacao(float TaxaImportacao) {
        this.TaxaImportacao = TaxaImportacao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }

    public void setImposto(float Imposto) {
        this.Imposto = Imposto;
    }

}
