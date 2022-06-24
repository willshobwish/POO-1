/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio01;

/**
 *
 * @author Willian
 */
public class Peca {

    protected String Nome;
    protected float Custo;
    protected float Lucro;

//    Construtor sem parametros
    Peca() {

    }

//    Construtor com parametros
    public Peca(String Nome, float Custo, float Lucro) {
        this.Nome = Nome;
        this.Custo = Custo;
        this.Lucro = Lucro;
    }

//    Calculo de preco
    public float CalcularPreco() {
        return Custo + Lucro;
    }

//    Exibicao de atributos
    public void Exibir() {
        System.out.println("Nome: " + Nome);
        System.out.println("Custo: " + Custo);
        System.out.println("Lucro: " + Lucro);
    }

//    Getter
    public String getNome() {
        return Nome;
    }

    public float getCusto() {
        return Custo;
    }

    public float getLucro() {
        return Lucro;
    }

//    Setter
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setCusto(float Custo) {
        this.Custo = Custo;
    }

    public void setLucro(float Lucro) {
        this.Lucro = Lucro;
    }

}
