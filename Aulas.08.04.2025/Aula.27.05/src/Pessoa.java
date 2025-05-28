public class Pessoa {
    //Atributo
    double peso, altura;

    //Construtor
    public Pessoa(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    double CalcularIMC(Pessoa p) {
        double IMC = peso / (altura * altura);
        return IMC;
    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(85.5, 1.87);
        Pessoa p2 = new Pessoa(50.0, 1.0);

        System.out.printf("%.2f\n", p1.CalcularIMC(p1));
        System.out.printf("%.2f\n", p2.CalcularIMC(p2));
    }
}
