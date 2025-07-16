class Ingresso {
    protected float valor;

    public Ingresso(float valor) {
        this.valor = valor;
    }

    public void exibirDetalhes() {
        System.out.printf("Ingresso Comum: Valor: R$ %.2f\n", valor);
    }
}