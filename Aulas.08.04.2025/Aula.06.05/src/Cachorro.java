public class Cachorro {

    String nome;
    int idade;
    double peso;

    public static void main(String[] args) {
        //Cria e instancia
        Cachorro c = new Cachorro();

        c.nome = "Rubi";
        c.idade = 2;
        c.peso = 3.5;

        System.out.println("Nome: " + c.nome);
        System.out.println("Idade: " + c.idade);
        System.out.println("Peso: " + c.peso);
    }
}
