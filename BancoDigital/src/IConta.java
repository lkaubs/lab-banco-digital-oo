public interface IConta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, IConta contaDestino) throws Exception;
    void imprimirExtrato();
    void creditar(double valor);
    void debitar(double valor) throws Exception;
}
