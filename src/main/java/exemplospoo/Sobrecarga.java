package exemplospoo;

public class Sobrecarga {
    public static void pagarPrestacao(String codBarras, double valor) {
        System.out.println("Prestação paga com sucesso!");
    }

    public static void pagarPrestacao(int numPrestacao, String codBarras, double valor) {
        System.out.println("Prestação " + numPrestacao + " paga com sucesso!");
    }
}
