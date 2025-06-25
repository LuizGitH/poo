public class Passageiro {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if (nome ==null || nome.isEmpty()) {
            System.out.println("Nome invalido!");
        }else {
            this.nome = nome;
        }
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if (idade >= 0 && idade <= 120) {
            this.idade = idade;
        } else {
            System.out.println("Idade invalido!");
        }
    }

    public static void main(String[] args) {
        Passageiro p1 = new Passageiro();
        Passageiro p2 = new Passageiro();
        Passageiro p3 = new Passageiro();
        Passageiro p4 = new Passageiro();
        Passageiro p5 = new Passageiro();
        Passageiro p6 = new Passageiro();

        p1.setNome("Carla Mendes");
        p1.setIdade(28);

        p2.setNome("Lucas Silva");
        p2.setIdade(17);

        p3.setNome("");
        p3.setIdade(45);

        p4.setNome("Júlia Fernandes");
        p4.setIdade(121);

        p5.setNome("Rafael Santos");
        p5.setIdade(-3);

        p6.setNome(null);
        p6.setIdade(38);

        System.out.println("----- DADOS DOS PASSAGEIROS -----\n");

        System.out.println("Passageiro 1:");
        System.out.println("Nome: " + p1.getNome() + " - Idade: " + p1.getIdade() + " anos\n");

        System.out.println("Passageiro 2:");
        System.out.println("Nome: " + p2.getNome() + " - Idade: " + p2.getIdade() +  "anos\n");

        System.out.println("Passageiro 3:");
        System.out.println("Nome: " + p3.getNome() + " - Idade: " + p3.getIdade() + " anos\n");

        System.out.println("Passageiro 4:");
        System.out.println("Nome: " + p4.getNome() + " - Idade: " + p4.getIdade() + " anos\n");

        System.out.println("Passageiro 5:");
        System.out.println("Nome: " + p5.getNome() + " - Idade: " + p5.getIdade() + " anos\n");

        System.out.println("Passageiro 6:");
        System.out.println("Nome: " + p6.getNome() + " - Idade: " + p6.getIdade() + " anos\n");


    }




}
