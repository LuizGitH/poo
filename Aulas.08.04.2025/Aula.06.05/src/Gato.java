public class Gato {

    String nome;

    //Metodo
    void emitirSom(){
        System.out.println("Miau!");
    }

    void apresentarIdade(int idade){
        System.out.println("Idade: " + idade);
    }

    void apresentarNome(String nome) {
        System.out.println("Nome: " + nome);
    }

    public static void main(String[] args) {
        Gato patinha = new Gato();

        patinha.nome = "Patinha";

        patinha.emitirSom();

        System.out.println("nome: " + patinha.nome);
    }
}
