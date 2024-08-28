public class Cliente {
    private String nome;

    public Cliente(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome do cliente: " + this.nome;
    }
}
