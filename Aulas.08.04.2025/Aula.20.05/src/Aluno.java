import java.util.Scanner;

public class Aluno {
    double notaFinal;


    void atualizarNota(double novaNota) {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Qual a nova nota?");
        novaNota = sc2.nextDouble();
                notaFinal = novaNota;
    }

    void exibirSituacao() {
        if (notaFinal<=10 && notaFinal>=6){
            System.out.println("O aluno está Aprovado");
        } else if (notaFinal<6 && notaFinal>=4) {
            System.out.println("O aluno está de Recuperação");
        } else if (notaFinal<4 && notaFinal>=0) {
            System.out.println("O aluno está Reprovado");
        } else {
            System.out.println("Nota invalida");
        }
    }

    void compararNotas(Aluno outro) {
        if (notaFinal > outro.notaFinal) {
            System.out.println("O aluno com maior nota é o João");
        } else if (notaFinal < outro.notaFinal) {
        System.out.println("O aluno com maior nota é a Ana");
        } else {
            System.out.println("Os alunos estão empatados, não tem auluno com maior nota");
        }
    }

    public static void main(String[] args) {
        char opcao;
        Scanner sc = new Scanner(System.in);
        Aluno joao = new Aluno();
        Aluno ana = new Aluno();

        System.out.println("Qual a nota final do João: ");
        joao.notaFinal = sc.nextDouble();

        System.out.println("Qual a nota final da Ana: ");
        ana.notaFinal = sc.nextDouble();

        System.out.println("Quer atualizar a nota final? Escreva S - sim e N - não");
        opcao = sc.next().charAt(0);

        if (opcao=='S'){
            System.out.println("Quer alterar a nota final do J - João ou da A -  Ana?");
            opcao = sc.next().charAt(0);

            if (opcao=='J') {
                joao.atualizarNota(joao.notaFinal);
            } else if (opcao=='A') {
                ana.atualizarNota(ana.notaFinal);
            } else {
                System.out.println("Opcao invalida");
            }}

            //__________________________________________________________________________
            System.out.println("A nota da ana é " + ana.notaFinal);
            ana.exibirSituacao();

            System.out.println("A nota do João é " + joao.notaFinal);
            joao.exibirSituacao();

            joao.compararNotas(ana);
        }

}
