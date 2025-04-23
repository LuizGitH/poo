import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner leia_01 = new Scanner(System.in);

        System.out.println("Nome do professor:");
        String nome = leia_01.next();

        System.out.println("Idade do professor:");
        int idade = leia_01.nextInt();

        System.out.println("Nome do Curso:");
        leia_01.nextLine();
        String nomeCurso = leia_01.nextLine();

        System.out.println("Número de alunos matriculados:");
        int matricula = leia_01.nextInt();

        System.out.println("Nome completo do cordenador do curso:");
        leia_01.nextLine();
        String nomeCursoCompleto = leia_01.nextLine();

        System.out.println(nome + idade + nomeCurso + matricula + nomeCursoCompleto);

    }
}
