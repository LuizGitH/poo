public class Calculadora {
    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }


    public static void main(String[] args) {
        System.out.println("Soma: " + Calculadora.somar(10, 5));
        System.out.println("Subtração: " + Calculadora.subtrair(10, 5));
        System.out.println("Multiplicação: " + Calculadora.multiplicar(10, 5));
        System.out.println("Divisão: " + Calculadora.dividir(10, 5));

        System.out.println("Divisão: " + Calculadora.dividir(8, 0));
    }
}
