public class Veiculo {
    String modelo, marca;
    int ano;

    public void ligar(){
        System.out.println("O veiculo ligou");
    }

    public void exibirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }
}
