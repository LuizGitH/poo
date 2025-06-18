public class AlunoATV {
     String nome;
     int idade;
     double nota1;
     double nota2;
     double nota3;

    public AlunoATV(String nome, int idade, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.idade = idade;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public AlunoATV(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        nota1 = 0;
        nota2 = 0;
        nota3 = 0;
    }

    public void exibirRelatorio() {
        System.out.println("Nome: " + nome + " | Idade: " + idade);
        System.out.printf("Notas: %.1f, %.1f, %.1f\n", nota1, nota2, nota3);
        double media = calcularMedia();
        System.out.printf("Média: %.2f\n", media);
        String situacao = media >= 7.0 ? "Aprovado" : "Reprovado";
        System.out.println("Situação: " + situacao);
    }

    public void atualizarNota(int indice, double novaNota) {
        if (indice < 1 || indice > 3) {
            System.out.println("Índice inválido. Use 1, 2 ou 3.");
            return;
        }
        if (indice == 1) nota1 = novaNota;
        else if (indice == 2) nota2 = novaNota;
        else nota3 = novaNota;
    }

    public void compararDesempenho(AlunoATV outro) {
        double media1 = this.calcularMedia();
        double media2 = outro.calcularMedia();

        if (media1 > media2) {
            System.out.println(this.nome + " tem desempenho superior a " + outro.nome + ".");
        } else if (media1 < media2) {
            System.out.println(outro.nome + " tem desempenho superior a " + this.nome + ".");
        } else {
            System.out.println("Ambos têm o mesmo desempenho.");
        }
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3.0;
    }

    public boolean houveMelhora() {
        return nota1 < nota2 && nota2 < nota3;
    }

    public AlunoATV gerarCloneComMesmoDesempenho() {
        return new AlunoATV(this.nome, 0, this.nota1, this.nota2, this.nota3);
    }

    public static void main(String[] args) {
        AlunoATV a1 = new AlunoATV("Carlos", 22, 6.0, 7.5, 8.0);
        AlunoATV a2 = new AlunoATV("Bruna", 20);

        a2.atualizarNota(1, 7.0);
        a2.atualizarNota(2, 7.0);
        a2.atualizarNota(3, 7.0);

        a1.exibirRelatorio();
        System.out.println();
        a2.exibirRelatorio();
        System.out.println();
        a1.compararDesempenho(a2);

        System.out.println("Carlos melhorou ao longo do tempo? " + a1.houveMelhora());
        System.out.println();
        AlunoATV clone = a1.gerarCloneComMesmoDesempenho();
        clone.exibirRelatorio();
    }
}
