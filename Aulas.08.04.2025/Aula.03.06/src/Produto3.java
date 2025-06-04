public class Produto3 {
    String nome;
    int quantidade;
    double precoUnitario;

    public Produto3(String nome, int quantidade, double precoUnitario) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public Produto3(String nome) {
        this.nome = nome;
        this.quantidade = 0;
        this.precoUnitario = 0;
    }

    void exibirResumo () {
        System.out.println("Produto: " + nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço unitario: R$" + precoUnitario);
    }

    double valorTotalEstoque() {
        return quantidade * precoUnitario;
    }

    void reporEstoque(Produto3 outroProduto) {
        quantidade += outroProduto.quantidade;
    }

    Produto3 duplicarProduto () {
        return new Produto3(nome, quantidade, precoUnitario);
    }

    public static void main(String[] args) {
        Produto3 p1 = new Produto3("Caderno", 100, 5.50);
        Produto3 p2 = new Produto3("Caderno", 50, 5.50);
        p1.reporEstoque(p2);
        p1.exibirResumo();
        System.out.println("Valor total em estoque: " + p1.valorTotalEstoque());
        System.out.println();
        Produto3 p3 = p1.duplicarProduto();
        p3.exibirResumo();
    }
}
