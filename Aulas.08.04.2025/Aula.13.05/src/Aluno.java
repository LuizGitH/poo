import java.util.Scanner;

public class Aluno {

    double AV_01, AV_02, AV_03, AV_04, media;

    void mediaAritimetica(double AV_01, double AV_02, double AV_03, double AV_04) {
        media = (AV_01 + AV_02 + AV_03+AV_04)/4;

        if(media <4) {
            System.out.printf("O aluno está REPROVADO, pois sua média é %.2f%n", media);
        }
        else if (media >= 4 && media < 6) {
            System.out.printf("O aluno está de RECUPERAÇÃO, pois sua média é %.2f%n", media);
        }
        else if (media >= 6 && media <=10) {
            System.out.printf("O aluno está APROVADO, pois sua média é %.2f%n", media);
        }
        else {
            System.out.println("Valores invalidos, tentar novamente");
        }
    }

    public static void main(String[] args) {
        Aluno a = new Aluno();
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a 1ª nota: ");
        a.AV_01 = sc.nextDouble();

        System.out.println("Qual a 2ª nota: ");
        a.AV_02 = sc.nextDouble();

        System.out.println("Qual a 3ª nota: ");
        a.AV_03 = sc.nextDouble();

        System.out.println("Qual a 4ª nota: ");
        a.AV_04 = sc.nextDouble();

        a.mediaAritimetica(a.AV_01, a.AV_02, a.AV_03, a.AV_04);
    }
}
