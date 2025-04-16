import java.util.Locale;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {



        //PARA VARIAVEIS SEM ESPAÇO
        Scanner leia_02 = new Scanner(System.in);
        System.out.println("Digite seu primeiro nome:");
        String nome = leia_02.next();

        //PARA VARIAVEIS COM ESPAÇO
        Scanner leia_03 = new Scanner(System.in);
        System.out.println("Digite seu nome completo:");
        String nomeCompleto = leia_03.next();

        //PARA VARIAVEIS INTEIRAS
        Scanner leia_04 = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        int idade = leia_04.nextInt();

        //PARA VARIAVEIS DOUBLE
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o peso (com virgula): ");
        double peso = leia.nextDouble();

        //Se eu quiser usar o ponto
        Locale.setDefault(Locale.US);
        Scanner leia_05 = new Scanner(System.in);
        System.out.println("Informe sua altura (com ponto): ");
        double altura = leia_05.nextDouble();

        //PARA VARIAVEIS CARACTER
        Scanner leia_06 = new Scanner(System.in);
        System.out.println("Informe seu sexo (f ou m): ");
        char sexo = leia_06.next().charAt(0);

        //PARA DIGITAR VARIAS INFORMAÇÕES DE UMA VEZ, separados por espaço

        Scanner leia_07 = new Scanner(System.in);
        System.out.println("Qual o nome, idade e peso do seu prof? (separados por espaço e com ponto)");
        String prof = leia_07.next();
        int idadeProf = leia_07.nextInt();
        double pesoProf = leia_07.nextDouble();

        //

        System.out.println(nomeCompleto + " tem o peso " + peso + " Kg e tem a altura de " + altura+ " metros. " + nome + " com " + idade + " anos quer entrar na academia");
        System.out.println("O meu sexo é: " + sexo);
        System.out.println("Prof " + prof + " tem " + idadeProf + " anos e tem o peso de " + pesoProf + "Kg");
    }
}
