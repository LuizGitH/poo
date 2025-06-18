public class Produto {
    String nome;
    String categoria;
    int quantidade;
    double precoUnitario;

    public Produto(String nome, String categoria, int quantidade, double precoUnitario) {
        this.nome = nome;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public Produto(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
        quantidade = 0;
        precoUnitario = 0;
    }

    public void exibirResumo() {
        System.out.println("Resumo do Produto:");
        System.out.println("Nome: " + nome + " | Categoria: " + categoria);
        System.out.printf("Quantidade: %d | Preço Unitário: R$%.2f%n", quantidade, precoUnitario);
        System.out.printf("Valor Total: R$%.2f%n", calcularValorTotal());
    }

    public void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual <= 100) {
            double desconto = precoUnitario * (percentual / 100);
            precoUnitario -= desconto;
        }
    }

    public void compararValorTotal(Produto outro) {
        double valorThis = this.calcularValorTotal();
        double valorOutro = outro.calcularValorTotal();

        if (valorThis > valorOutro) {
            System.out.println("Produto mais valioso em estoque: " + this.nome);
        } else if (valorOutro > valorThis) {
            System.out.println("Produto mais valioso em estoque: " + outro.nome);
        } else {
            System.out.println("Os produtos têm o mesmo valor total em estoque");
        }
    }

    public double calcularValorTotal() {
        return quantidade * precoUnitario;
    }

    public boolean estaEmEstoque() {
        return quantidade > 0;
    }

    public static Produto gerarProdutoPromocional(String novoNome, double percentualDesconto, Produto base) {
        Produto promocional = new Produto(novoNome, base.categoria, base.quantidade, base.precoUnitario);
        promocional.aplicarDesconto(percentualDesconto);
        return promocional;
    }
    public static void main(String[] args) {
        Produto p1 = new Produto("Parafuso", "Fixação", 100, 0.50);
        Produto p2 = new Produto("Bucha", "Fixação", 50, 0.80);

        p1.aplicarDesconto(10);
        p1.exibirResumo();
        System.out.println();

        p2.exibirResumo();
        System.out.println();

        p1.compararValorTotal(p2);
        System.out.println("Parafuso está em estoque? " + p1.estaEmEstoque());
        System.out.println();

        Produto promo = Produto.gerarProdutoPromocional("Bucha - Promoção", 20, p2);
        promo.exibirResumo();
    }

}
