
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class Conta implements IConta{
    private List<Operacao> operacoes;
    private static int idContas = 0;
    private final int id;
    private final Cliente cliente;
    private double saldo;

    public Conta(Cliente cliente, double saldo) {
        Conta.idContas += 1;
        this.id = Conta.idContas;
        this.cliente = cliente;
        this.saldo = saldo;
        this.operacoes = new ArrayList<>();
    }

    public double getSaldo() {
        return saldo;
    }

    public String getCliente() {
        return cliente.toString();
    }

    @Override
    public void creditar(double valor){
        saldo += valor;
    }

    @Override
    public void debitar(double valor) throws Exception{
        if (valor > saldo) throw new Exception("Saldo insuficiente.");
        else saldo -= valor;
    }
    @Override
    public void depositar(double valor) {
        creditar(valor);
        operacoes.add(new Operacao(valor, "Depósito", this, this));
    }

    @Override
    public void sacar(double valor){
        try {
            debitar(valor);
            System.out.println("Saque concluído com sucesso!");
            operacoes.add(new Operacao((-1)*valor, "Saque", this, this));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public int getId(){
        return this.id;
    }
    @Override
    public void transferir(double valor, IConta conta) throws Exception{
        try {
            debitar(valor);
            conta.creditar(valor);
        }
        catch (Exception e) {
            throw e;
        }
    }
    public void adicionaOperacao(Operacao operacao){
        this.operacoes.add(operacao);
    }
    @Override
    public String toString() {
        return  "Titular da Conta: " + this.cliente.getNome() + "\n" +
                "Id: " + id +   "\n" +
                "Extrato: \n\n" + operacoes.stream().map((operacao) -> operacao.toString()).collect(Collectors.joining("\n")) + "\n" +
                "   Saldo: " + saldo + "\n";
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(this.toString());
    }
}
