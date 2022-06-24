/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio01;

/**
 *
 * @author Willian
 */
public class Principal {

    public static void main(String[] args) {
        Pessoa Teste = new Pessoa("Teste", 2000);
        Teste.AdicionarContato(new Email("AAAAAAAAAAAAAA"));
        Teste.AdicionarContato(new Telefone("@@@@@@@@@@@@@@"));
        System.out.println(Teste.GetContatos());
    }

}
