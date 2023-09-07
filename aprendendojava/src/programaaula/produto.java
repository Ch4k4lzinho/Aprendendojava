package programaaula;

public class produto {
    public String nome;
    public double preço;
    public int quantidade;


    public double valorTotalemStoque(){
        return preço * quantidade;

    }
    public void addProdutos(int quantidade){
        this.quantidade += quantidade;
    }
    
    public void removerProdutos(int quantidade){
        this.quantidade -= quantidade;
    }


}
