package exercicio03;

// Um banco mantém contas de clientes armazenando o número da conta, o nome do cliente e
// o saldo atual da conta. Os clientes podem depositar o quanto quiserem nas contas, mas podem
// sacar somente enquanto a conta possuir saldo positivo.

public class Clientes {
    private int conta;
    private String nome;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setDados(int conta, String nome) {
        this.conta = conta;
        this.nome = nome;
    }

    public void setDepositar(double valor) {
        saldo += valor;
    }

    public boolean setSacar(double valor) {
        if (saldo >= valor) {
            saldo = -valor;
            return true;
        } else {
            return false;
        }
    }
}
