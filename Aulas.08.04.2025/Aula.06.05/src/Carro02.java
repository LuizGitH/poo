public class Carro02 {

    void nomeProprietario(String nome) {
        System.out.println("O nome do proprietário é: " + nome);
    }

    public static void main(String[] args) {
        Carro02 c = new Carro02();
        c.nomeProprietario("Luiz");
    }
}
