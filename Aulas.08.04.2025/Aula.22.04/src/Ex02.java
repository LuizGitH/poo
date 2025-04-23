import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner leia_01 = new Scanner(System.in);
        System.out.println("Idade:");
        int idade = leia_01.nextInt();

        System.out.println("Peso:");
        double peso = leia_01.nextDouble();

        System.out.println("Nome completo:");
        leia_01.nextLine();
        String nomeCompleto = leia_01.nextLine();

        System.out.println(nomeCompleto + " tem " + idade + " anos e " + peso + " anos" );
    }
}
