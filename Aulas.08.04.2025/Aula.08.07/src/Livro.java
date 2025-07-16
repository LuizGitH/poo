public class Livro extends Produto {
    String autor;

    public Livro(String nome, double preco, String autor) {
        super(nome, preco);
        System.out.println("[DEBUG] Construtor de Livro sendo chamado...");
        this.autor = autor;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Autor: " + autor);
    }
}
