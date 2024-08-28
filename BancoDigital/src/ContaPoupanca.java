public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente, double saldo) {
        super(cliente, saldo);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirExtrato();
    }
}
