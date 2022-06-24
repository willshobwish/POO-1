package exercicio02;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Willian
 */
public class ContaCorrente {

    private String Numero;
    private String Titular;
    private double Saldo;
    private double LimiteDaConta;

//    Construtor sem parametros
    public ContaCorrente() {
    }

//    Construtor com parametros
    public ContaCorrente(String Numero, String Titular, double Saldo, double LimiteDaConta) {
        this.Numero = Numero;
        this.Titular = Titular;
        this.Saldo = Saldo;
        this.LimiteDaConta = LimiteDaConta;
    }

//Funcao depositar dinheiro
    public void Depositar(double ValorDoDeposito) {
        if (ValorDoDeposito > 0) {
            Saldo += ValorDoDeposito;

        } else {
            System.out.println("Nao eh possivel depositar numeros negativos");
        }
    }

//    Funcao saque com limite
    public void Saque(double Valor) {
        if (Saldo + LimiteDaConta >= Valor) {
            Saldo -= Valor;
        } else {
            System.out.println("Saldo e limite insuficientes");
        }
    }

//    Funcao para exibicao de todas as informacoes da conta
    public void Exibir() {
        System.out.println("Numero da conta: " + Numero);
        System.out.println("Titular da conta: " + Titular);
        System.out.println("Saldo da conta: " + Saldo);
        System.out.println("Limite da conta: " + LimiteDaConta);
        System.out.println("");
    }

//    Metodo get
    public String getNumero() {
        return Numero;
    }

    public String getTitular() {
        return Titular;
    }

    public double getSaldo() {
        return Saldo;
    }

    public double getLimiteDaConta() {
        return LimiteDaConta;
    }

//    Metodo set
    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public void setTitular(String Titular) {
        this.Titular = Titular;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public void setLimiteDaConta(double LimiteDaConta) {
        this.LimiteDaConta = LimiteDaConta;
    }

}
