package exemplospoo;

public class ContaCorrenteEncapsulada {
    private double saldo;
    private PessoaEncapsulada pessoa;

    public PessoaEncapsulada getPessoa() {
        return pessoa;
    }

    public void realizarSaque(double valorSaque) {
        if (valorSaque <= this.saldo) {
            this.saldo -= valorSaque;
            System.out.printf("\nSaque no valor de R$ %s realizado com sucesso", valorSaque);
        } else {
            System.out.println("\nValor do saque indisponível, consulte seu saldo");
        }
    }

    public double consultarSaldo() {
        return this.saldo;
    }

    public void depositar(double valorDeposito) {
        this.saldo += valorDeposito;
    }

    // default
    ContaCorrenteEncapsulada() {
        this.pessoa = new PessoaEncapsulada();
    }

}
