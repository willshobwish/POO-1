/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio03;

/**
 *
 * @author Willian
 */
public class ProdutoImportado {

    private String Descricao;
    private float Valor;
    private float Imposto;
    private float Taxa;
    private float TaxaImportacao;

    public ProdutoImportado(String Descricao, float Valor, float Imposto, float Taxa, float TaxaImportacao) {
        this.Descricao = Descricao;
        this.Valor = Valor;
        this.Imposto = Imposto;
        this.Taxa = Taxa;
        this.TaxaImportacao = TaxaImportacao;
    }

    public void Exibir() {
        System.out.println("Descricao: " + Descricao);
        System.out.println("Valor: R$" + Valor);
        System.out.println("Imposto: " + Imposto + "%");
        System.out.println("Taxa: " + Taxa + "%");
        System.out.println("Taxa de importacao: " + TaxaImportacao + "%");
        System.out.println("Valor total: R$" + CalcularValorTotal());
    }

    public double CalcularValorTotal() {
        return Valor + Valor * Imposto / 100 + Valor * Taxa / 100 + Valor * TaxaImportacao / 100;
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

    public float getTaxa() {
        return Taxa;
    }

    public float getTaxaImportacao() {
        return TaxaImportacao;
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

    public void setTaxa(float Taxa) {
        this.Taxa = Taxa;
    }

    public void setTaxaImportacao(float TaxaImportacao) {
        this.TaxaImportacao = TaxaImportacao;
    }

}
