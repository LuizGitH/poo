public class Triangulo {
    //atributos
    double ladoA, ladoB, ladoC;

    //Crie um construtor que receba os três lados e utilize a palavra reservada this.

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    //Metodos

    //boolean validarTriangulo()
    //o Verifica se os lados formam um triângulo válido (regra no final do exercício)

    boolean validarTriangulo() {
        return ((ladoA+ladoB > ladoC) && (ladoA +ladoC>ladoB) && (ladoB+ladoC > ladoA));
    }

    //double calcularArea()
    //o Retorna a área do triângulo utilizando a fórmula de Heron (final do exercício)

    double calcularArea() {
        double p = (ladoA+ladoB+ladoC)/2;
        double area = Math.sqrt(p*(p-ladoA)*(p-ladoB)*(p-ladoC));
        return area;
    }

    public static void main(String[] args) {
        Triangulo x = new Triangulo(3.0, 4.0, 5.0);
        Triangulo y = new Triangulo(7.5, 7.0, 5.0);

        if (x.validarTriangulo() && y.validarTriangulo()) {
            double areaX = x.calcularArea();
            double areaY = y.calcularArea();

            System.out.printf("Area do triângulo x: %.2f\n", areaX);
            System.out.printf("Area do triângulo y: %.2f\n", areaY);
            if (areaX == areaY) {
                System.out.println("Os triângulos tem areas iguais");
            } else if (areaX > areaY) {
                System.out.println("Triângulo com maior área: X");
            } else {
                System.out.println("Triângulo com maior área: Y");
            }

        }
    }

}
