public class Cliente {
    String endereco;

    void atualizarEndereco(String novoEndereco) {
        this.endereco = novoEndereco;
    }

    void copiarEndereco(Cliente outro) {
        this.endereco = outro.endereco;
        System.out.println("Endereço copiado com sucesso.");
    }

    void exibirEndereco() {
        System.out.println("Novo endereço do cliente: " + this.endereco);
    }

    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        Cliente c2 = new Cliente();

        c1.endereco = "Rua A, 123";
        c2.endereco = "Rua B, 456";

        c2.copiarEndereco(c1);
        c2.exibirEndereco();
    }
}
