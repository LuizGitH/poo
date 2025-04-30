import java.util.Scanner;
public class Atividade_Casa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomeComleto;
        int idade;
        double peso, altura, IMC;

        System.out.println("Qual o nome comleto:");
        nomeComleto = sc.nextLine();

        System.out.println("Qual a idade:");
        idade = sc.nextInt();

        System.out.println("Qual a peso:");
        peso = sc.nextDouble();

        System.out.println("Qual a altura:");
        altura = sc.nextDouble();

        //____________________________________________________________________________
        IMC = peso/(altura*altura);
        System.out.print("Nome e idade: " + nomeComleto + ", "+ idade + " anos\n");
        System.out.println("Peso: " + peso + "kg");
        System.out.printf("Altura: %.2f m\n", altura);
        System.out.printf("IMC: %.2f\n", IMC);

        //____________________________________________________________________________
        if (IMC < 18.5) {
            System.out.println("Categoria do IMC: Abaixo do peso");
        } else if (18.5 <= IMC && IMC< 25.0) {
            System.out.println("Categoria do IMC: Peso normal");
        } else if (25.0 <= IMC && IMC< 30.0) {
            System.out.println("Categoria do IMC: Sobrepeso");
        } else if (30.0 <= IMC && IMC< 35.0) {
            System.out.println("Categoria do IMC: Obesidade grau I ");
        } else if (35.0 <= IMC && IMC< 40.0) {
            System.out.println("Categoria do IMC: Obesidade grau II");
        } else if (40.0 <= IMC ) {
            System.out.println("Categoria do IMC: Obesidade grau III ");
        } else {
            System.out.println("Categoria do IMC: Não encontrado, calculo errado");
        }
    }
}
