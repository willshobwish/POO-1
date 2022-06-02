/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio01;

/**
 *
 * @author Willian
 */
public class Email extends Contato {

    private String EnderecoEmail;

    public Email(String EnderecoEmail) {
        EnderecoEmail = this.EnderecoEmail;
    }

    @Override
    public void Exibir() {
        System.out.println(EnderecoEmail);
    }
}
