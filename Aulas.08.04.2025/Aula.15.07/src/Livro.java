public class Livro extends ItemBiblioteca {
    private String autor;

    public Livro(String titulo, int anoPublicacao, String autor) {
        super(titulo, anoPublicacao); // chama o construtor da superclasse
        this.autor = autor;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Autor: " + this.autor);
    }
}
