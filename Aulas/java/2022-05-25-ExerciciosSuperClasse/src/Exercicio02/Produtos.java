/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio02;

/**
 *
 * @author Willian
 */
public class Produtos {

    protected String Descricao;
    protected float Valor;

    public Produtos() {
    }

    public Produtos(String Descricao, float Valor) {
        this.Descricao = Descricao;
        this.Valor = Valor;
    }

    public void Exibir() {
        System.out.println("Produto sem tipo");
        System.out.println("Descricao: " + Descricao);
        System.out.println("Valor: " + Valor);
        System.out.println("");
    }

}
