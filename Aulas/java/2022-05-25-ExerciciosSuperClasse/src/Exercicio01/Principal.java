/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio01;

/**
 *
 * @author Willian
 */
//1) Implemente uma hierarquia de classes que represente peças utilizadas para montar equipamentos eletrônicos, como computadores, por exemplo. A classe base (ou superclasse) chama-se Peça e possui os atributos nome, custo e lucro. Os métodos são os construtores, getters, setters, cálculo de preço e um de exibição. O preço da peça é calculado pela soma do custo com o lucro. O método exibir é para mostrar os valores dos atributos das peças. A classe derivada (ou subclasse) é a classe que representa uma Peça Importada. Essa classe, além dos atributos de Peça, possui os atributos taxa de importação e taxa do frete para o transporte da peça. A adição destes atributos irá influenciar o cálculo do preço, pois é preciso somar essas taxas ao preço base da peça (custo + lucro). O método exibir também deverá mostrar os valores dos atributos taxaImportacao e taxaFrete. Implemente também os métodos get e set para todos os atribuitos. Crie algumas instâncias (objetos) para testar o programa.
public class Principal {

    public static void main(String[] args) {
//        Criacao da classe de execucao de sistema
        Sistema sis = new Sistema();
        sis.Executar();
    }
}
