

public class Conta {
    private String nome;
    private double saldo;

    public Conta(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) throws Exception{
        if (valor > saldo) throw new Exception("Saldo insuficiente");
        else saldo -= valor;
    }

    public void transferir(double valor, Conta conta) throws Exception {
        try {
            sacar(valor);
            conta.depositar(valor);
        }
        catch (Exception e) {
            throw e;
        }  
    }
}
