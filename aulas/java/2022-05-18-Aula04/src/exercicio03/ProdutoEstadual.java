/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio03;

/**
 *
 * @author Willian
 */
public class ProdutoEstadual {

    private String Descricao;
    private float Valor;
    private float Imposto;

    public ProdutoEstadual(String Descricao, float Valor, float Imposto) {
        this.Descricao = Descricao;
        this.Valor = Valor;
        this.Imposto = Imposto;
    }

    public void Exibir() {
        System.out.println("Descricao: " + Descricao);
        System.out.println("Valor: R$" + Valor);
        System.out.println("Imposto: " + Imposto + "%");
        System.out.println("Valor total: R$" + CalcularValorTotal());
    }

    public double CalcularValorTotal() {
        return Valor + Valor * Imposto / 100;
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
