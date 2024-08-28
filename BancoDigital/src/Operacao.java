public class Operacao {
    double valor;
    String tipo;
    Conta contaOrigem;
    Conta contaDestino;

    public Operacao(double valor, String tipo, Conta contaOrigem, Conta contaDestino) {
        this.valor = valor;
        this.tipo = tipo;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
    }

    @Override
    public String toString() {
        return  "Valor: " + valor + "\n" +
                "Tipo: " + tipo + "\n" +
                "Conta de Origem: " + contaOrigem.getId() + "\n" +
                "Conta de Destino: " + contaDestino.getId() + "\n";
    }
}
