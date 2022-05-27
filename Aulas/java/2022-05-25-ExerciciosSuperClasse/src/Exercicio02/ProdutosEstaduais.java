/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio02;

/**
 *
 * @author Willian
 */
public class ProdutosEstaduais {

    protected String Descricao;
    protected float Valor;
    protected float Imposto;

//    Construtor sem parametros
    public ProdutosEstaduais() {

    }

//    Construtor com parametros
    public ProdutosEstaduais(String Descricao, float Valor, float Imposto) {
        this.Descricao = Descricao;
        this.Valor = Valor;
        this.Imposto = Imposto;
    }

//    Exibicao de atributos
    public void Exibir() {
        System.out.println("Tipo de produto: Estadual");
        System.out.println("Descricao: " + Descricao);
        System.out.println("Valor: " + Valor);
        System.out.println("Imposto: " + Imposto);
        System.out.println("");

    }

//    Getter
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
