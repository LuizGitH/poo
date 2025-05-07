public class Conta {
    String num_Conta;
    double saldo;

    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.num_Conta = "33399-2";
        conta.saldo = 1000;

        System.out.println("Numero da conta: " + conta.num_Conta);
        System.out.println("Saldo: " + conta.saldo);

    }
}
