class Vendedor extends Empregado {
    private float percentualComissao;

    public Vendedor(String nome, float salario, float percentualComissao) {
        super(nome, salario);
        this.percentualComissao = percentualComissao;
    }

    public float getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(float percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public float calcularSalario() {
        return salario + (salario * percentualComissao);
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.printf("Comissão: %.1f%%\n", percentualComissao * 100);
        System.out.printf("Salário Final: R$ %.2f\n", calcularSalario());
    }
}
