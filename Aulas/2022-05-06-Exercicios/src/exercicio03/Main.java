package exercicio03;

// Um banco mantém contas de clientes armazenando o número da conta, o nome do cliente e
// o saldo atual da conta. Os clientes podem depositar o quanto quiserem nas contas, mas podem
// sacar somente enquanto a conta possuir saldo positivo.

public class Main {
    public static void main(String[] args) {
        Clientes ClienteTeste = new Clientes();
        ClienteTeste.setDados(999999, "Alpha");
        ClienteTeste.setDepositar(100.00);
        if (ClienteTeste.setSacar(50.00)) {
            System.out.println("Saque realizado");
        } else {
            System.out.println("Saldo insuficiente");
        }
        if (ClienteTeste.setSacar(50.00)) {
            System.out.println("Saque realizado");
        } else {
            System.out.println("Saldo insuficiente");
        }
        if (ClienteTeste.setSacar(50.00)) {
            System.out.println("Saque realizado");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
