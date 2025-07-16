public class TesteBanco {
    public static void main(String[] args) {
        ContaPoupanca cp = new ContaPoupanca();

        cp.nomeTitular = "Ana Silva";
        cp.numeroDaConta = "12345-6";
        cp.saldo = 1000.00;
        cp.taxaDeJuros = 0.5;

        System.out.println("--- Situação Inicial da Conta Poupança ---");
        cp.exibirSaldo();
        System.out.println("----------------------------------------");

        System.out.println(">>> Realizando operações...");
        cp.depositar(500);
        cp.sacar(200);
        System.out.println("----------------------------------------");

        System.out.println("--- Situação Final da Conta Poupança ---");
        cp.exibirSaldo();
        System.out.println("----------------------------------------");
    }
}
