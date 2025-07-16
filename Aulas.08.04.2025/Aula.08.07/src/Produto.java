public class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        System.out.println("[DEBUG] Construtor de Produto sendo chamado...");
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirDetalhes() {
        System.out.println("--- Detalhes do Produto ---");
        System.out.println("Produto: " + nome);
        System.out.printf("Preço: R$ %.2f\n", preco);
    }
}
