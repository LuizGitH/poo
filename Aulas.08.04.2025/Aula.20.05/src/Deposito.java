import java.util.Scanner;

public class Deposito {

    int quantidade;


    void receber(int qtd) {
        quantidade += qtd;
    }

    void enviar(int qtd) {
        if(quantidade >= qtd) {
            quantidade -= qtd;
        }else{
            System.out.println("Estoque insuficiente");
        }
    }

    void trasferir (Deposito depDestino, int qtd) {
        //verificar se existe estoque no deposito de origem
        if(quantidade >= qtd) {
            //retirando produto no deposito de origem
            quantidade -=qtd;
            //
            depDestino.quantidade += qtd;
        }else{
            System.out.println("Estoque insuficiente");
        }

    }

    public static void main(String[] args) {
        Deposito depDistino = new Deposito();
        Deposito depOrigem = new Deposito();

        depOrigem.receber(100);
        depOrigem.trasferir(depDistino,20);
        System.out.println("Qnt dep origem: " + depOrigem.quantidade);
        System.out.println("Qnt dep distino: " + depDistino.quantidade);
    }
}
