public class ContaPoupanca extends ContaBancaria {
    double taxaDeJuros;

    public void exibirSaldo() {
        System.out.println("Titular: " + nomeTitular);
        System.out.println("Conta: " + numeroDaConta);
        System.out.printf("Saldo atual: R$ %.2f\n", saldo);
        System.out.println("Taxa de Juros: " + taxaDeJuros + "%");
    }
}
