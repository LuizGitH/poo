public class Bateria {
    //Atributo
    int carga;

    //construtor
    public Bateria(int carga) {
        this.carga = carga;
    }

    //Metodo que retorna
    int obterCarga() {
        return this.carga;
    }
    public static void main(String[] args) {
        Bateria b = new Bateria(85);

        System.out.println("Carga: " + b.obterCarga());

    }
}
