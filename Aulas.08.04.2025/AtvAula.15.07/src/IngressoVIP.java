class IngressoVIP extends Ingresso {
    private float valorAdicional;

    public IngressoVIP(float valor, float valorAdicional) {
        super(valor); // chama o construtor da superclasse
        this.valorAdicional = valorAdicional;
    }

    @Override
    public void exibirDetalhes() {
        float valorFinal = valor + valorAdicional;
        System.out.printf("Ingresso VIP: Valor: R$ %.2f\n", valorFinal);
    }
}
