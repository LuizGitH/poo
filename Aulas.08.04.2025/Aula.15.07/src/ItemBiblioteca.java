public class ItemBiblioteca {
    protected String titulo;
    protected int anoPublicacao;
    protected boolean emprestado;

    public ItemBiblioteca(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.emprestado = false; // sempre inicia como disponível
    }

    public void emprestar() {
        this.emprestado = true;
    }

    public void devolver() {
        this.emprestado = false;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Ano de Publicação: " + this.anoPublicacao);
        System.out.println("Status: " + (this.emprestado ? "Emprestado" : "Disponível"));
    }
}
