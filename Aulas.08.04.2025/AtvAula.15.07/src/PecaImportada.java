public class PecaImportada extends Peca {
    private float taxaImportacao;
    private float taxaFrete;

    public PecaImportada(String nome, float custo, float lucro, float taxaImportacao, float taxaFrete) {
        super(nome, custo, lucro);
        this.taxaImportacao = taxaImportacao;
        this.taxaFrete = taxaFrete;
    }

    public float getTaxaImportacao() {
        return taxaImportacao;
    }

    public void setTaxaImportacao(float taxaImportacao) {
        this.taxaImportacao = taxaImportacao;
    }

    public float getTaxaFrete() {
        return taxaFrete;
    }

    public void setTaxaFrete(float taxaFrete) {
        this.taxaFrete = taxaFrete;
    }

    @Override
    public float calcularPreco() {
        return super.calcularPreco() + taxaImportacao + taxaFrete;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.printf("Custo: R$ %.2f\n", getCusto());
        System.out.printf("Lucro: R$ %.2f\n", getLucro());
        System.out.printf("Taxa de Importação: R$ %.2f\n", taxaImportacao);
        System.out.printf("Taxa de Frete: R$ %.2f\n", taxaFrete);
        System.out.printf("Preço Final: R$ %.2f\n", calcularPreco());
        System.out.println("--------------------------------");
    }
}
