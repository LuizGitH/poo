public class TanqueAgua {
    //atributos
    String identificacao;
    double capacidadeTotal, volumeAtual, calculo;

    //Construtor

    //Crie um construtor que receba todos os parâmetros e
    //utilize a palavra reservada this para inicializar os atributos.
    public TanqueAgua(String identificacao, double capacidadeTotal, double volumeAtual) {
        this.identificacao = identificacao;
        this.capacidadeTotal = capacidadeTotal;
        this.volumeAtual = volumeAtual;
    }
    //Métodos

    //double percentualOcupado() → retorna o percentual atual de ocupação do tanque.
    //Fórmula: (volumeAtual / capacidadeTotal) * 100

    double percentualOcupado(){
        calculo = (volumeAtual / capacidadeTotal) * 100;
        return calculo;
    }

    //double volumeRestante() → retorna quantos litros ainda cabem no tanque.
    //Fórmula: capacidadeTotal - volumeAtual

    double volumeRestante() {
        calculo = capacidadeTotal - volumeAtual;
        return calculo;
    }

    //double estimarDuracao(double consumoDiario) → retorna a estimativa de dias que a
    //água armazenada pode durar

    double estimarDuracao(double consumoDiario) {
        calculo =volumeAtual / consumoDiario;
        return calculo;
    }

    void exibirRelatorio(double consumoDiario) {
        System.out.println("Tanque: " + identificacao);
        System.out.println("Capacidade total: " + capacidadeTotal + " litros");
        System.out.println("Volume atual: " + volumeAtual + " litros");
        System.out.printf("Percentual ocupado: %.2f%% \n", percentualOcupado());
        System.out.printf("Volume restante: %.2f litros\n", volumeRestante());
        System.out.printf("Consumo diário estimado: %.2f litros/dia\n", consumoDiario);
        System.out.printf("Estimativa de duração da água: %.2f dias\n", estimarDuracao(consumoDiario));
    }

    public static void main(String[] args) {
        TanqueAgua t= new TanqueAgua("Caixa Principal", 1000.0, 650.0);
        t.exibirRelatorio(130.0);
    }

}
