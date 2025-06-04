public class Funcionario {

    double salario;

    double diferenxaSalarial (Funcionario f, double meuSalario) {
        double diferenciaSalarial;
        if (meuSalario >= f.salario) {
            diferenciaSalarial = meuSalario - f.salario;
        }else {
            diferenciaSalarial = f.salario - meuSalario;
        }
        return diferenciaSalarial;
    }

    public static void main(String[] args) {
        Funcionario davi = new Funcionario();
        Funcionario Lucas = new Funcionario();

        davi.salario = 1000;
        Lucas.salario = 2000;
        System.out.println("Diferença: " + davi.diferenxaSalarial(Lucas, davi.salario));
    }
}
