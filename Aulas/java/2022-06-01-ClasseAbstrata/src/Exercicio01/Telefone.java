/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio01;

/**
 *
 * @author Willian
 */
public class Telefone extends Contato {

    private String NumeroTelefone;

    public Telefone(String NumeroTelefone) {
        NumeroTelefone = this.NumeroTelefone;
    }

    @Override
    public void Exibir() {
        System.out.println(NumeroTelefone);
    }
}
