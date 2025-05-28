public class Eletrodomestico {
     String nome;
     double potencia;
     double horasPorDia;

    public Eletrodomestico(String nome, double potencia, double horasPorDia) {
        this.nome = nome;
        this.potencia = potencia;
        this.horasPorDia = horasPorDia;
    }

    public double wattsDia() {
        return potencia * horasPorDia;
    }

    public double wattsMes() {
        return wattsDia() * 30;
    }

    public double wattsAno() {
        return wattsMes() * 12;
    }

    public double gastoMensal(double precoKwatt) {
        return (wattsMes() / 1000) * precoKwatt;
    }

    public void exibirRelatorio(double precoKwatt) {
        System.out.println("Eletrodoméstico: " + nome);
        System.out.printf("Potência do aparelho: P = %.2f watts%n", potencia);
        System.out.printf("Tempo de utilização diária: %.2f horas/dia%n", horasPorDia);
        System.out.printf("Consumo diário: %.2f W%n", wattsDia());
        System.out.printf("Consumo mensal: %.2f W%n", wattsMes());
        System.out.printf("Consumo anual: %.2f W%n", wattsAno());
        System.out.printf("Preço do Kwatt: R$ %.2f%n", precoKwatt);
        System.out.printf("Gasto mensal estimado: R$ %.2f%n", gastoMensal(precoKwatt));
    }

    public static void main(String[] args) {
        Eletrodomestico e = new Eletrodomestico("Telefone Sem Fio", 3.0, 24.0);
        e.exibirRelatorio(0.27);
    }
}



