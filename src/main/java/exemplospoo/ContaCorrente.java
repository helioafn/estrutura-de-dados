package exemplospoo;

// Nesse exemplo a classe está sem nenhum encapsulamento, que faz os seus membros
// poderem ser acessados de qualquer lugar.
public class ContaCorrente {
    public double saldo;
    public Pessoa pessoa;

    // Aqui o construtor está como default (só é visível a própria classe e classes do mesmo pacote)
    ContaCorrente() {
        if (this.pessoa == null) {
            this.pessoa = new Pessoa();
        }
    }

}
