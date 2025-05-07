public class Carro {
    String marca, modelo, placa, cor;
    int ano;
    double preco;

    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.marca = "vw";
        meuCarro.modelo = "gol";
        meuCarro.ano = 2025;
        meuCarro.placa = "ASD8S12";
        meuCarro.cor = "Verde";
        meuCarro.preco = 15000;

        System.out.println("Marca: " + meuCarro.marca);
        System.out.println("Modelo: " + meuCarro.modelo);
        System.out.println("Ano: " + meuCarro.ano);
        System.out.println("Placa: " + meuCarro.placa);
        System.out.println("Cor: " + meuCarro.cor);
        System.out.println("Preço: " + meuCarro.preco);

    }
}
