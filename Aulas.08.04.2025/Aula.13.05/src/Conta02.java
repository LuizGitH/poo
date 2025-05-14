public class Conta02 {
    double saldo;

    void Creditar(double valor) {
        saldo = saldo + valor;
        System.out.printf("Saldo atual: %.2f%n", saldo);
    }
    void Debitar(double valor) {
        if (saldo >= valor) {
            saldo = saldo - valor;
            System.out.println("Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    void Trasferir(Conta02 contaCreditada, double valor) {
        if (saldo >= valor) {

            // colocando o dinheiro

            contaCreditada.saldo = contaCreditada.saldo - valor;

            //Retirando o dinheiro de quem chamou
            saldo = saldo - valor;

            System.out.println("Saldo da conta creditada: " + contaCreditada.saldo);
            System.out.println("Saldo da conta debitada: " + saldo);

        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public static void main(String[] args) {
        Conta02 contaDavi = new Conta02();
        Conta02 contaMaria = new Conta02();
        contaMaria.saldo = 0;
        contaDavi.saldo = 1000;

        contaDavi.Trasferir(contaMaria, 250);

    }
}
