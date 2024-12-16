public class Invoice {
    
    private String numero;
    
    private String descricao;
    
    private int quantidade;
    
    private double preco;

    
    public Invoice(String numero, String descricao, int quantidade, double preco) {
        
        this.numero = numero;
        
        this.descricao = descricao;
        
        setQuantidade(quantidade);
        
        setPreco(preco);
        
    }

    
    public String getNumero() {
        
        return numero;
    }

    public void setNumero(String numero) {
        
        this.numero = numero;
    
        
    }

    public String getDescricao() {
        
        return descricao;
    
        
    }

    public void setDescricao(String descricao) {
        
        this.descricao = descricao;
    }

    public int getQuantidade() {
        
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        
        if (quantidade > 0) {
            
            this.quantidade = quantidade;
        } 
        
        else {
            
            this.quantidade = 0;
        }
    }

    public double getPreco() {
        
        return preco;
    }

    public void setPreco(double preco) {
        
        if (preco > 0) {
            
            this.preco = preco;
            
        } 
        
        else {
            
            this.preco = 0.0;
        }
    }

    
    public double getInvoice() {
        
        return quantidade * preco;
    
        
    }

    
    public String print() {
        
        return String.format("Número: %s\nDescrição: %s\nQuantidade: %d\nPreço por item: R$ %.2f\nTotal: R$ %.2f",numero, descricao, quantidade, preco, getInvoice());
    }
}