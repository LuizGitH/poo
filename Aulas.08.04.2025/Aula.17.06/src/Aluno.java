public class Aluno {
    String nome;
    int idade;
    static int quantidadeAlunos = 0;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        quantidadeAlunos++;
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Aluno", 20);
        System.out.println("Quantidade de alunos: " + Aluno.quantidadeAlunos);
    }
}
