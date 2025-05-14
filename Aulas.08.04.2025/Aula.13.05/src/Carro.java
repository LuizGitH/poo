import java.util.Scanner;

public class Carro {

    double precoFinal;

    void ValorTabelaFIPE(double preco) {
        precoFinal = (preco*0.8);

        System.out.printf("O valor do carro pela tabela FIPE é de: R$%.2f\n", precoFinal);
    }

    public static void main(String[] args) {
        double preco;

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o preço do carro: ");
        preco = sc.nextDouble();

        System.out.println();

        Carro c = new Carro();
        c.ValorTabelaFIPE(preco);
    }
}
