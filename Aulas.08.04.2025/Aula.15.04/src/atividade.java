import java.util.Locale;
import java.util.Scanner;
public class atividade {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite: Maria 30 4.5");
        String nome = leia.next();
        int idade = leia.nextInt();
        double peso = leia.nextDouble();

        System.out.println("Dados digitados:");
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(peso);
    }
}
