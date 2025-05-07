public class Pessoa03 {

    void calcularIMC(double peso, double altura) {
        double imc = peso / (altura * altura);
        System.out.printf("O seu IMC é %.2f", imc);
    }

    public static void main(String[] args) {
        Pessoa03 p = new Pessoa03();

        p.calcularIMC(72.5,1.68);
    }
}
