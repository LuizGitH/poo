public class Funcionario {
    protected String nome, matricula;
    protected double salarioBase;

    public Funcionario(String nome, String matricula, double salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salario;
    }

    public double calcularSalario(){
        return salarioBase;
    }


}
