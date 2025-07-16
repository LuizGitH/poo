public class Gerente extends Funcionario {
    private double percentualBonus;

    public Gerente(String nome, String matricula, double salarioBase, double percentualBonus) {
        super(nome, matricula, salarioBase);
        this.percentualBonus = percentualBonus;
    }


    @Override
    public double calcularSalario() {
        return salarioBase + (salarioBase * percentualBonus);
    }


    public double getPercentualBonus() {
        return percentualBonus;
    }
}
