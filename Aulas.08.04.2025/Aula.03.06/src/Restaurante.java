public class Restaurante {
    String nome, cidade;
    double nota_01, nota_02, nota_03;

    public Restaurante(String nome, String cidade, double nota_01, double nota_02, double nota_03) {
        this.nome = nome;
        this.cidade = cidade;
        this.nota_01 = nota_01;
        this.nota_02 = nota_02;
        this.nota_03 = nota_03;
    }

    public Restaurante(String nome, String cidade){
        this.nome = nome;
        this.cidade = cidade;
        this.nota_01 = 0;
        this.nota_02 = 0;
        this.nota_03 = 0;
    }


    void exibirDados(){
        System.out.println("Restaurante: " + nome);
        System.out.println("Cidade: " + cidade);
        double media = (nota_01 + nota_02 + nota_03)/3;

        System.out.printf("Notas %.2f, %.2f e %.2f \n",nota_01,nota_02,nota_03);
        System.out.printf("Media: %.2f \n",media);
    }
    void atualizarNota (int numeroNota, double novaNota) {
        System.out.println("\nNotas atualizadas!");
        if(numeroNota == 1){
            nota_01 = novaNota;
        }
        else if(numeroNota == 2){
            nota_02 = novaNota;
        }
        else if(numeroNota == 3){
            nota_03 = novaNota;
        }
    }

    double calcularMedia() {
        return  ((nota_01 + nota_02 + nota_03)/3);
    }

    boolean estaAprovado() {
        return calcularMedia() >= 7;
    }

    Restaurante clonarRestaurante() {

        return new Restaurante(nome, cidade, nota_01, nota_02, nota_03);
    }

    public static void main(String[] args) {
        Restaurante rl = new Restaurante("Sabor Goiano", "Uruaçu", 8.5, 9.0, 7.5);
        rl.exibirDados();
        rl.atualizarNota(2,6.5);
        System.out.printf("Média: %.2f\n",rl.calcularMedia());
        System.out.println("Aprovado? " + rl.estaAprovado());
        Restaurante r2 = rl.clonarRestaurante();
        r2.exibirDados();
    }

}
