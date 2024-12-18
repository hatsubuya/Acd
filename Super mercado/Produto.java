public class Produto {
    
    private Descricao descricao;
    
    private double preco;
    
    private int quantidade;

    
    public Produto(Descricao descricao, double preco, int quantidade) {
        
        this.descricao = descricao;
        
        this.preco = preco;
        
        this.quantidade = quantidade;
    
        
    }

    
    public Descricao getDescricao() {
        
        return descricao;
    
        
    }

    public void setDescricao(Descricao descricao) {
        
        this.descricao = descricao;
    
        
    }

    public double getPreco() {
        
        return preco;
    
        
    }

    public void setPreco(double preco) {
        
        this.preco = preco;
    
        
    }
    
    public boolean desconto(int item){
        
        if(quantidade>item)
        {
            this.quantidade =quantidade-item;
            
            return true;
        }
        
        else
        {
            System.out.println("valor invalido unidades execedem o estoque");
            
            return false;
        }
        
    }

    public int getQuantidade() {
        
        return quantidade;
    
        
    }

    public void setQuantidade(int quantidade) {
        
        this.quantidade = quantidade;
    
        
    }
    
    public double total(int mult)
    {
        return mult*preco;
    }
    
    @Override
    public String toString() {
        
        return "Produto: " + descricao + ", Preço: R$" + preco + ", Quantidade: " + quantidade;
    
        
    }
}