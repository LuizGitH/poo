public class LojaOnline {
    public static void main(String[] args) {
        Livro livro = new Livro("O Senhor dos Anéis", 99.90, "J.R.R. Tolkien");
        System.out.println(">>> Solicitando a exibição dos detalhes do livro...");
        livro.exibirDetalhes();
    }
}
