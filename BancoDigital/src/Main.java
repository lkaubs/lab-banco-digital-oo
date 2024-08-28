
public class Main {
    public static void main(String[] args) throws Exception {
        Banco banco = new Banco();
        banco.setNome("FooBank");
        Conta conta = new ContaPoupanca(new Cliente("João"), 1000);
        Conta conta1 = new ContaCorrente(new Cliente("Jorge"), 1000);
        banco.adicionaConta(conta1);
        banco.adicionaConta(conta);
        banco.tranferencia(conta1, conta, 1001);
        banco.tranferencia(conta1, conta, 100);
        conta1.sacar(1000);
        conta1.sacar(500);
        banco.imprimirExtratos();
    }
}
