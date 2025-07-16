public class BibliotecaTeste {
    public static void main(String[] args) {
        Livro livro = new Livro("A Arte da Guerra", 1910, "Sun Tzu");

        System.out.println("--- Detalhes do Item (Antes do Empréstimo) ---");
        livro.exibirDetalhes();
        System.out.println("-----------------------------------------------");

        livro.emprestar();

        System.out.println("--- Detalhes do Item (Após o Empréstimo) ---");
        livro.exibirDetalhes();
        System.out.println("----------------------------------------------");
    }
}
