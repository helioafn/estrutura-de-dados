package exemplospoo;

// Nesse exemplo a classe está sem nenhum encapsulamento, que faz os seus membros
// poderem ser acessados de qualquer lugar.
public class Pessoa {
    public String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa() {
        this("Sem nome");
    }
}
