import java.util.Scanner;

public class Atividade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vendedor1, vendedor2, vendedor3, produto1, produto2, produto3;
        int qntProduto1, qntProduto2, qntProduto3 ;
        double preco_1, preco_2, preco_3;

        System.out.println("Digite o nome do vendedor1, qual o produto vendido, a quantidade e o preço unitário: (Separados por espaços) ");
        vendedor1 = sc.next();
        produto1 = sc.next();
        qntProduto1 = sc.nextInt();
        preco_1 = sc.nextDouble();

        System.out.println("Digite o nome do vendedor2, qual o produto vendido, a quantidade e o preço unitário: (Separados por espaços) ");
        vendedor2 = sc.next();
        produto2 = sc.next();
        qntProduto2 = sc.nextInt();
        preco_2 = sc.nextDouble();

        System.out.println("Digite o nome do vendedor3, qual o produto vendido, a quantidade e o preço unitário: (Separados por espaços) ");
        vendedor3 = sc.next();
        produto3 = sc.next();
        qntProduto3 = sc.nextInt();
        preco_3 = sc.nextDouble();

        //_________________________________________________________________________________________________________________________________________________________

        System.out.print("\nRelatório de Vendas de Eletrônicos\n");
        System.out.print("venda 1:\n");
        System.out.println("Vendedor: " + vendedor1);
        System.out.println("Produto: " + produto1);
        System.out.printf("Quantidade: %d\n", qntProduto1);
        System.out.printf("Preço Unitário: R$ %.2f\n", preco_1);
        System.out.println("Total: R$ " + (preco_1*qntProduto1));

        System.out.print("\nvenda 2:\n");
        System.out.println("Vendedor: " + vendedor2);
        System.out.println("Produto: " + produto2);
        System.out.printf("Quantidade: %d\n", qntProduto2);
        System.out.printf("Preço Unitário: R$ %.2f\n", preco_2);
        System.out.println("Total: R$ " + (preco_2*qntProduto2));

        System.out.print("\nvenda 3:\n");
        System.out.println("Vendedor: " + vendedor3);
        System.out.println("Produto: " + produto3);
        System.out.printf("Quantidade: %d\n", qntProduto3);
        System.out.printf("Preço Unitário: R$ %.2f\n", preco_3);
        System.out.println("Total: R$ " + (preco_3*qntProduto3));

        System.out.print("\nTotal Geral das Vendas: R$" + ((preco_1*qntProduto1)+(preco_2*qntProduto2)+(preco_3*qntProduto3)));



    }
}
