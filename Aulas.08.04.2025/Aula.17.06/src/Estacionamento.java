public class Estacionamento {
    private String placa;
    private String modelo;
    private boolean estacionado;

    private static int vagasDisponiveis = 5;

    public Estacionamento(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;

        if (vagasDisponiveis > 0) {
            estacionado = true;
            vagasDisponiveis--;
        } else {
            estacionado = false;
            System.out.println("Estacionamento cheio. Não foi possível estacionar o veículo: " + placa);
        }
    }

    public void exibirDados() {
        if (estacionado) {
            System.out.println("Veículo estacionado:");
            System.out.println("Placa: " + placa);
            System.out.println("Modelo: " + modelo);
            System.out.println("------");
        }
    }

    public static void exibirVagasDisponiveis() {
        System.out.println("Vagas disponíveis: " + vagasDisponiveis);
    }

    public static void main(String[] args) {
        Estacionamento.exibirVagasDisponiveis();
        System.out.println();
        Estacionamento v1 = new Estacionamento("ABC-1234", "Fiat Uno");
        Estacionamento v2 = new Estacionamento("DEF-5678", "Chevrolet Onix");
        Estacionamento v3 = new Estacionamento("GHI-9012", "Hyundai HB20");
        Estacionamento v4 = new Estacionamento("JKL-3456", "Volkswagen Gol");
        Estacionamento v5 = new Estacionamento("MNO-7890", "Renault Sandero");

        v1.exibirDados();
        v2.exibirDados();
        v3.exibirDados();
        v4.exibirDados();
        v5.exibirDados();

        Estacionamento v6 = new Estacionamento("PQR-4321", "Toyota Corolla");

        v6.exibirDados();

        Estacionamento.exibirVagasDisponiveis();
    }
}
