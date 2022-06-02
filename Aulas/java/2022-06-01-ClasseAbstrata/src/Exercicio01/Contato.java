/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio01;

/**
 *
 * @author Willian
 */
public abstract class Contato {

    protected String TipoContato;

    public Contato() {
        TipoContato = "Contato";
    }

//    Metodos abstratos nao podem possuir "corpo", isso eh para tornar obrigatorio a criacao do metodo
    public abstract void Exibir();

    public String GetTipo() {
        return TipoContato;
    }
}
