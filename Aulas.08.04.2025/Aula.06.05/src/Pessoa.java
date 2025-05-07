//Classe

public class Pessoa {

    //Atributos

    String nome;
    String telefone;
    String cpf;

    //Metodos

    public static void main(String[] args) {
        Pessoa pes = new Pessoa();
        pes.nome = "Luiz";
        pes.telefone = "(62) 9 8565-8480";
        pes.cpf = "111.222.333.44";

        System.out.println("O " + pes.nome + " tem o número: " + pes.telefone + " com o CPF: " + pes.cpf);


    }
}
