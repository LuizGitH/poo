public class Passagem {
    String nomePassageiro, classe;
    int distanciaKm;

    public Passagem(String nomePassageiro, String classe, int distanciaKm) {
        this.nomePassageiro = nomePassageiro;
        this.classe = classe;
        this.distanciaKm = distanciaKm;
    }

    double calcularValor(){
        if (classe =="Economica"){
            return distanciaKm * 0.5;
        }
        else if (classe =="Executiva") {
            return distanciaKm * 0.75;
        }
        else if (classe =="Primeira") {
            return distanciaKm * 1;
        }
        else {
            return 0;
        }
    }

    void exibirResumo() {
        System.out.println("Passageiro: " + nomePassageiro);
        System.out.println("Distancia " + distanciaKm + " km");
        System.out.println("Classe: " + classe);
        System.out.printf("Valor: R$%.2f", calcularValor());
    }

    boolean compararValor(Passagem outra) {
        return calcularValor() > outra.calcularValor();
    }

    public static void main(String[] args) {
        Passagem p1 = new Passagem("Lucas", "Executiva", 300);
        p1.exibirResumo();

        Passagem p2 = new Passagem("Maria", "Economica", 300);
        p2.exibirResumo();
        System.out.println("Valor de p1 é maior que p2? " + p1.compararValor(p2));

    }

}
