public class Principal {

    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Corola";
        meuCarro.ano = 2023;

        meuCarro.nroPortas = 4;

        meuCarro.ligar();
        meuCarro.exibirDados();

        System.out.println("N de portas: " + meuCarro.nroPortas);
    }
}
