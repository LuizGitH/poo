public class EmpresaTeste {
    public static void main(String[] args) {
        Gerente g = new Gerente("Carlos Pereira", "G-101", 7000.00, 0.15);

        System.out.println("Funcionário: " + g.nome + " (Matrícula: " + g.matricula + ")");
        System.out.println("Cargo: Gerente");
        System.out.printf("Salário Base: R$ %.2f\n", g.salarioBase);
        System.out.printf("Bônus: %.1f%%\n", g.getPercentualBonus() * 100);
        System.out.println("---------------------------------");
        System.out.printf("Salário Final: R$ %.2f\n", g.calcularSalario());
    }
}
