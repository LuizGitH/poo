public class Prova {
    String titulo;
    int quantidadeQuestoes;
    int dificuldade;

    public Prova(String titulo, int quantidadeQuestoes, int dificuldade) {
        this.titulo = titulo;
        this.quantidadeQuestoes = quantidadeQuestoes;
        this.ajustarDificuldade(dificuldade); // Usa o método para validar
    }

    public Prova(String titulo) {
        this(titulo, 0, 0);
    }

    public void mostrarResumo() {
        System.out.println("Prova: " + this.titulo);
        System.out.println("Quantidade de Questões: " + this.quantidadeQuestoes);
        System.out.println("Dificuldade: " + this.dificuldade);
    }

    public void ajustarDificuldade(int novaDificuldade) {
        if (novaDificuldade >= 1 && novaDificuldade <= 5) {
            this.dificuldade = novaDificuldade;
        }
    }

    public void compararDificuldade(Prova outra) {
        if (this.dificuldade > outra.dificuldade) {
            System.out.println("Prova " + this.titulo + " é mais difícil que " + outra.titulo + ".");
        } else if (this.dificuldade < outra.dificuldade) {
            System.out.println("Prova " + outra.titulo + " é mais difícil que " + this.titulo + ".");
        } else {
            System.out.println("As provas " + this.titulo + " e " + outra.titulo + " têm a mesma dificuldade.");
        }
    }

    public int totalDeQuestoes() {
        return this.quantidadeQuestoes;
    }

    public int diferencaQuestoes(Prova outra) {
        return Math.abs(this.quantidadeQuestoes - outra.quantidadeQuestoes);
    }

    public Prova criarVersaoAlternativa(String novoTitulo, int adicionais, Prova base) {
        return new Prova(novoTitulo, base.quantidadeQuestoes + adicionais, base.dificuldade);
    }

    public static void main(String[] args) {
        Prova p1 = new Prova("POO - Revisão", 10, 4);
        Prova p2 = new Prova("Lógica");
        p2.ajustarDificuldade(3);

        p1.mostrarResumo();
        System.out.println();
        p2.mostrarResumo();
        System.out.println();
        p1.compararDificuldade(p2);
        System.out.println("Total de questões em p1: " + p1.totalDeQuestoes());
        System.out.println("Diferença de questões: " + p1.diferencaQuestoes(p2));
        System.out.println();
        Prova especial = p1.criarVersaoAlternativa("POO - Versão Especial", 5, p1);
        especial.mostrarResumo();
    }
}
