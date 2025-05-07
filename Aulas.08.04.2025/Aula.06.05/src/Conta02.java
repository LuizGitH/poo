public class Conta02 {
    int nrconta;
    int saldo;

    void mostrarClinete(int nrconta, int saldo) {
        System.out.println("O número da conta do cliente é " + nrconta + " e o saldo é " + saldo);
    }

    public static void main(String[] args) {
        Conta02 c = new Conta02();
        c.mostrarClinete(1, 100);
    }
}
