public class ContaBancaria {
    String numeroDaConta, nomeTitular;
    double saldo;

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque de R$ " + valor);
        }
    }

    public void exibirSaldo() {
        System.out.println("Titular: " + nomeTitular);
        System.out.println("Conta: " + numeroDaConta);
        System.out.printf("Saldo atual: R$ %.2f\n", saldo);
    }
}
