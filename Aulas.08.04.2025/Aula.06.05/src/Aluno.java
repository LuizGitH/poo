public class Aluno {
    String nome;
    String telefone;
    int matricula;

    public static void main(String[] args) {
        Aluno Lu = new Aluno();
        Lu.nome = "Luiz";
        Lu.telefone = "(62) 9 8565-8480";
        Lu.matricula = 20202025;

        System.out.println("Aluno: " + Lu.nome);
        System.out.println("Telefone: " + Lu.telefone);
        System.out.println("Matricula: " + Lu.matricula);
    }
}
