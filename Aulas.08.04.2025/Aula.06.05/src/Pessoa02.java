public class Pessoa02 {
    int CPF = 123456789;
    void mostarCPF() {
        System.out.println("O CPF da pessoa é: " + CPF);
    }

    public static void main(String[] args) {
        Pessoa02 p = new Pessoa02();

        p.mostarCPF();
    }
}
