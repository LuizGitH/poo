public class LivroLeitura {
    String titulo, autor;
    int totalPaginas, paginasLidas;

    public LivroLeitura(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = 100;
        this.paginasLidas = 0;
    }

    public LivroLeitura(String titulo, String autor, int totalPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
    }

    public LivroLeitura(String titulo, String autor, int totalPaginas, int paginasLidas) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
        this.paginasLidas = paginasLidas;
    }

    void exibirProgresso() {
        System.out.println("O titulo do Livro é: " + titulo);
        System.out.println("O autor do livro é: " + autor);
        System.out.println("O total de paginas é: " + totalPaginas);
        System.out.println("O total de paginas lidas é: " + paginasLidas);
    }

    void lerPaginas(int quantidade) {
        System.out.println("Lendo mais páginas ...");
        this.paginasLidas += quantidade;
        System.out.println("Progresso atualizado +"+ quantidade + " páginas");
    }

    void autualizarTotalPaginas(int novoTotal) {
        this.totalPaginas = novoTotal;
        System.out.println("O novo total de paginas é: " + totalPaginas);
    }

    public static void main(String[] args) {
        LivroLeitura livro = new LivroLeitura("A Menina que Roubava Livros","Markus Zusak");

        livro.exibirProgresso();
        System.out.println();
        livro.lerPaginas(40);
        System.out.println();

        livro.exibirProgresso();
        System.out.println();
        livro.lerPaginas(30);
        System.out.println();

        livro.exibirProgresso();
        System.out.println();
        livro.autualizarTotalPaginas(480);
        System.out.println();

        livro.exibirProgresso();
        System.out.println();
        livro.lerPaginas(100);
        System.out.println();

        livro.exibirProgresso();
        System.out.println();
    }
}
