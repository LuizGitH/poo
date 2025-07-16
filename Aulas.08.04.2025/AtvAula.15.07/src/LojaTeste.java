public class LojaTeste {
    public static void main(String[] args) {
        System.out.println("--- Catálogo de Produtos ---");

        Peca p1 = new Peca("Memória RAM 8GB", 150.00f, 50.00f);
        System.out.println("**Detalhes da Peça Nacional:**");
        p1.exibirDetalhes();

        PecaImportada p2 = new PecaImportada("Placa de Vídeo RTX", 2000.00f, 600.00f, 400.00f, 80.00f);
        System.out.println("**Detalhes da Peça Importada:**");
        p2.exibirDetalhes();
    }
}
