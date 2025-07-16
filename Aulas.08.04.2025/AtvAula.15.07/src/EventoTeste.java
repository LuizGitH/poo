public class EventoTeste {
    public static void main(String[] args) {
        System.out.println("--- Ingressos Disponíveis ---");

        Ingresso ingressoComum = new Ingresso(80.0f);
        ingressoComum.exibirDetalhes();

        IngressoVIP ingressoVIP = new IngressoVIP(80.0f, 50.0f);
        ingressoVIP.exibirDetalhes();

        System.out.println("---------------------------");
    }
}
