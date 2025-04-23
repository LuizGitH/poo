import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        String produto1 = "Computador";
        String produto2 = "Mesa";

        int idade = 30;
        int codigo = 5290;
        char sexo = 'F';

        double preco1 = 2100.0;
        double preco2 = 650.0;
        double medida = 53.234567;

        System.out.println("Produtos:");
        System.out.printf("%s, preco: %.1f\n", produto1, preco1);
        System.out.printf("%s, preco: %.1f\n", produto2, preco2);

        System.out.printf("Registro: %d anos, codigo: %d e sexo %c\n", idade, codigo, sexo);

        System.out.printf("Medida com 8 casas decimais: %.8f\n", medida);
        System.out.printf("Medida com 8 casas decimais: %.3f\n", medida);
        Locale.setDefault(Locale.US);
        System.out.printf("Medida com 8 casas decimais (Sistema decimal americano): %.8f\n", medida);
    }
}
