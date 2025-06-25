public class BicicletaEletrica {

    //atributos privados
    private String modelo;
    private int capacidadeBateria, nivelBateria;
    private double autonomiaTotal, distanciaPercorrida;

    // Getters
    public String getModelo()  {
        return modelo;
    }
    public int getCapacidadeBateria(){
        return capacidadeBateria;
    }
    public int getNivelBateria(){
        return nivelBateria;
    }
    public double getAutonomiaTotal(){
        return autonomiaTotal;
    }
    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    // Setters
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setCapacidadeBateria(int capacidadeBateria){
        this.capacidadeBateria = capacidadeBateria;
    }
    public void setNivelBateria(int nivelBateria){
        this.nivelBateria = nivelBateria;
    }
    public void setAutonomiaTotal(double autonomiaTotal){
        this.autonomiaTotal = autonomiaTotal;
    }

    //Métodos adicionais
    double autonomiaRestante(){
        return ((nivelBateria/100.0)*autonomiaTotal);
    }
    void registrarPercurso(double distancia) {
        if (distancia <= 0) return;

        distanciaPercorrida += distancia;

        double kmPorPorcentagem = autonomiaTotal / 100.0;
        int consumo = (int) Math.round(distancia / kmPorPorcentagem);
        nivelBateria -= consumo;

        if (nivelBateria < 0) {
            nivelBateria = 0;
        }
    }
    public void exibirRelatorio() {
        System.out.println("=== RELATÓRIO DA BICICLETA ELÉTRICA ===");
        System.out.println("Modelo: " + modelo);
        System.out.println("Capacidade da bateria: " + capacidadeBateria + "%");
        System.out.println("Nível atual da bateria: " + nivelBateria + "%");
        System.out.printf("Autonomia total: %.2f km%n", autonomiaTotal);
        System.out.printf("Autonomia restante: %.2f km%n", autonomiaRestante());
        System.out.printf("Distância percorrida hoje: %.2f km%n", distanciaPercorrida);
    }

    public static void main(String[] args) {
        BicicletaEletrica b1 = new BicicletaEletrica();
        BicicletaEletrica b2 = new BicicletaEletrica();

        b1.setModelo("EcoRide X200");
        b1.setCapacidadeBateria(100);
        b1.setNivelBateria(80);
        b1.setAutonomiaTotal(60.0);
        b1.registrarPercurso(15);
        b1.exibirRelatorio();

        System.out.println();

        b2.setModelo("PowerBike 3000");
        b2.setCapacidadeBateria(100);
        b2.setNivelBateria(60);
        b2.setAutonomiaTotal(80.0);
        b2.registrarPercurso(20);
        b2.exibirRelatorio();

    }
}
