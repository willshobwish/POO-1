/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio02;

/**
 *
 * @author Willian
 */
public class ProdutosNacionais extends ProdutosEstaduais {

    protected float Taxa;

//    Construtor sem parametros
    public ProdutosNacionais() {
    }

//    Construtor com parametros
    public ProdutosNacionais(String Descricao, float Valor, float Imposto, float Taxa) {
        super(Descricao, Valor, Imposto);
        this.Taxa = Taxa;
    }

//    Exibicao de atributos
    public void Exibir() {
        System.out.println("Tipo de produto: Nacional");
        System.out.println("Descricao: " + Descricao);
        System.out.println("Valor: " + Valor);
        System.out.println("Imposto: " + Imposto);
        System.out.println("Taxa: " + Taxa);
        System.out.println("");

    }

//    Getter
    public float getTaxa() {
        return Taxa;
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
    public void setTaxa(float Taxa) {
        this.Taxa = Taxa;
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
