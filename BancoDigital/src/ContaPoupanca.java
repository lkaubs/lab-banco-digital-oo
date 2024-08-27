public class ContaPoupanca extends Conta{

    private double rendimento;

    public ContaPoupanca(String nome, double saldo) {
        super(nome, saldo);
    }

    public double getRendimento() {
        return rendimento;
    }
}
