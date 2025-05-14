import java.util.Scanner;

public class Conta {

    double saldo, entrada, saida, saldoFinal;

    void Creditar(double saldo, double entrada) {

        saldoFinal = saldo + entrada;

        System.out.printf("Saldo atual: %.2f%n", saldoFinal);

    }

    void Debitar(double saldo, double saida, double entrada) {

        if ((saldo + entrada) < saida) {
            System.out.println("Saldo insuficiente");
        }
        else {
            saldoFinal = saldo + entrada - saida;
            System.out.printf("Saldo atual: %.2f%n", saldoFinal);
        }

    }

    public static void main(String[] args) {
        Conta c = new Conta();
        Scanner sc = new Scanner(System.in);

        System.out.println("Quanto tem de saldo na conta: ");
        c.saldo = sc.nextDouble();

        System.out.println("Quanto irá entrar (Creditar): ");
        c.entrada = sc.nextDouble();

        c.Creditar(c.saldo, c.entrada);

        System.out.println("Quanto irá saida (Debitar): ");
        c.saida = sc.nextDouble();

        c.Debitar(c.saldo, c.saida, c.entrada);
    }
}
