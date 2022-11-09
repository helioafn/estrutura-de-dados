package exemplospoo;

public class Carro {
    private String marca;
    private String modelo;
    private boolean perdaTotal;
    private Fabricante fabricante;

    public void deuPT() {
        this.perdaTotal = true;
    }

    public void naoDeuPT() {
        this.perdaTotal = false;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
