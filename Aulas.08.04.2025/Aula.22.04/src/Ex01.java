import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner leia_01 = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = leia_01.nextInt();

        System.out.println("Digite seu nome:");
        leia_01.nextLine(); //Para resolver um problema de captura
        String nome = leia_01.nextLine();



        System.out.println(nome + " tem " + idade + " anos");
    }
}
