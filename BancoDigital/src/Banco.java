
import java.util.ArrayList;

public class Banco {
    ArrayList<Conta> contas = new ArrayList();
    String nome;

    public void adicionaConta(Conta conta){
        contas.add(conta);
    }

    public void tranferencia(Conta conta1, Conta conta2, double valor){
        try{
            conta1.transferir(valor, conta2);
            conta1.adicionaOperacao(new Operacao((-1)*valor, "Transferência", conta1, conta2));
            conta2.adicionaOperacao(new Operacao(valor, "Transferência", conta2, conta1));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public ArrayList<Conta> getContas(){
        return this.contas;
    }

    public void imprimirExtratos(){
        System.out.println("\n=== Extratos das Contas do Banco " + this.getNome() + " ===\n");
        contas.stream().forEach(conta -> conta.imprimirExtrato());
    }
}
