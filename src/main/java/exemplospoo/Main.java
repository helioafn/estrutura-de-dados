package exemplospoo;
// Importando (nesse caso as classes) para uso no programa
// packagename.ClassName;
// packagename.ClassName.method;


public class Main {
    public static void main(String[] args) {
        BibliotecaDeOperacao operacoes = new BibliotecaDeOperacao();
        // Usando o método estático
        int res = BibliotecaDeOperacao.somar(1, 2);
        // Usando o método não estático (necessitando instanciar a classe)
        int res2 = operacoes.subtrair(1448, 111);
        System.out.println(res);
        System.out.println(res2);

        // usando os métodos sobrecarregados
        Sobrecarga.pagarPrestacao("123312", 487.50);
        Sobrecarga.pagarPrestacao(10, "13333444", 323.70);

        Carro carro = new Carro();
        carro.setMarca("Ka");
        carro.setModelo("Ford");
        System.out.printf("A marca é %s e modelo é %s\n", carro.getMarca(), carro.getModelo());


        // Exemplo de classes com atributos sem encapsulamento
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.pessoa.nome = "Maria Fernanda";
        contaCorrente.saldo = 300.00;

        System.out.printf("%s tem R$ %s na conta", contaCorrente.pessoa.nome, contaCorrente.saldo);

        contaCorrente.saldo -= 400.00;

        System.out.printf("\n%s tem R$ %s na conta", contaCorrente.pessoa.nome, contaCorrente.saldo);

        // Exemplo usando classes com atributos encapsulados
        ContaCorrenteEncapsulada contaCorrente2 = new ContaCorrenteEncapsulada();
        contaCorrente2.getPessoa().setNome("Maria Fernanda");
        contaCorrente2.depositar(300.00);

        System.out.printf("\n%s tem R$ %s na conta", contaCorrente2.getPessoa().getNome(),
                contaCorrente2.consultarSaldo());

        contaCorrente2.realizarSaque(400.00);
        System.out.printf("\n%s tem R$ %s na conta", contaCorrente2.getPessoa().getNome(),
                contaCorrente2.consultarSaldo());

        contaCorrente2.realizarSaque(299.00);
        System.out.printf("\n%s tem R$ %s na conta", contaCorrente2.getPessoa().getNome(),
                contaCorrente2.consultarSaldo());


        String[] nome = new String[10];

    }
}
