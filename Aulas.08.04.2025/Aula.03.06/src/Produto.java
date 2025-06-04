public class Produto {
    double preco;

    public Produto(double preco) {
        this.preco = preco;
    }

    double calcularDesconto(Produto p, double percentual) {
        return (p.preco * (1 - (percentual / 100)));
    }

    public static void main(String[] args) {
        Produto p = new Produto(100);
        System.out.println("Preço novo: " + p.calcularDesconto(p, 100));
    }
}
