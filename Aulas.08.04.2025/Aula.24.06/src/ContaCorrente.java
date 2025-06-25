public class ContaCorrente {
    //atributos privados
    private int numeroConta;
    private String nomeTitular;
    private double saldo, taxaMensal;

    // Getters
    public int getNumeroConta(){
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getSaldo(){
        return saldo;
    }

    public double getTaxaMensal() {
        return taxaMensal;
    }

    // Setters
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setNomeTitular(String nomeTitular){
        this.nomeTitular = nomeTitular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTaxaMensal(double taxaMensal){
        this.taxaMensal = taxaMensal;
    }

    //Métodos adicionais
    void exibirResumo() {
        System.out.println("=== RESUMO DA CONTA CORRENTE ===");
        System.out.printf("Número da Conta: %d%n", numeroConta);
        System.out.printf("Titular: %s%n", nomeTitular);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
        System.out.printf("Taxa Mensal: R$ %.2f%n", taxaMensal);
        }
    void depositar(double valor){
        this.saldo += valor;
    }
    void sacar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
        }else {
            System.out.println("Saldo insuficiente");
        }
    }
    public void aplicarTaxaMensal() {
        if (taxaMensal <= saldo) {
            saldo -= taxaMensal;
        } else {
            System.out.println("Saldo insuficiente para aplicar taxa mensal.");
        }
    }

    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente();
        ContaCorrente c2 = new ContaCorrente();

        c1.setNumeroConta(1023);
        c1.setNomeTitular("Mariana Costa");
        c1.setSaldo(1200.00);
        c1.setTaxaMensal(12.50);

        c1.depositar(300.00);
        c1.sacar(500.00);
        c1.aplicarTaxaMensal();
        c1.exibirResumo();

        System.out.println();

        c2.setNumeroConta(2077);
        c2.setNomeTitular("Carlos Eduardo");
        c2.setSaldo(850.00);
        c2.setTaxaMensal(15.00);

        c2.depositar(100.00);
        c2.sacar(250.00);
        c2.aplicarTaxaMensal();
        c2.exibirResumo();
    }


}
