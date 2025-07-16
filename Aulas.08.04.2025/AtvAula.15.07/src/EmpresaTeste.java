public class EmpresaTeste {
    public static void main(String[] args) {
        System.out.println("--- Relatório de Funcionários ---");

        Gerente g = new Gerente("Ana", 7500.00f, "Tecnologia");
        System.out.println("**Detalhes do Gerente:**");
        g.exibirDetalhes();

        Vendedor v = new Vendedor("Carlos", 2500.00f, 0.10f);
        System.out.println("**Detalhes do Vendedor:**");
        v.exibirDetalhes();

        System.out.println("---------------------------------");
    }
}
