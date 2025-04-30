import java.util.Scanner;

public class Atividade_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double aluguel, salario, servicos, material, publicidade, vendas;

        System.out.println("Escreva o valor das despesas fixas, sendo elas o Aluguel, Salário e Contas de Serviços Públicos: (Separados por espaço)");
        aluguel = sc.nextDouble();
        salario = sc.nextDouble();
        servicos = sc.nextDouble();

        System.out.println("Escreva o valor das despesas mensais, sendo elas o Material de Escritorio e Publicidade (Separados por espaço)");
        material = sc.nextDouble();
        publicidade = sc.nextDouble();

        System.out.println("\nEscreva o valor da receita mensal, sendo ela as vendas:");
        vendas = sc.nextDouble();

        //______________________________________________________________________

        System.out.print("\nRelatório Financeiro Empresarial ");
        System.out.print("\nDespesas Fixas Mensais:\n");
        System.out.println("- Aluguel: R$" + aluguel);
        System.out.println("- Salário: R$" + salario);
        System.out.println("- Contas de Serviços Públicos: R$" + servicos);

        System.out.print("\nDespesas Variáveis Mensais:\n");
        System.out.printf("- Material de Escritório: R$%.2f\n", material);
        System.out.printf("- Publicidade: R$%.2f\n", publicidade);

        System.out.print("\nReceita Mensal:\n");
        System.out.printf("- Vendas: R$%.2f\n", vendas);

        System.out.println("\nTotal de Despesas Fixas: R$" + (aluguel+ salario+servicos));
        System.out.println("Total de Despesas Variáveis: R$" + (material+publicidade));
        System.out.println("Total de Receitas: R$" + (vendas));

        System.out.println("\nLucro Líquido: R$" + (vendas-aluguel-salario-servicos-publicidade-material));

    }
}
