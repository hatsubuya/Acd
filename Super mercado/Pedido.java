public class Pedido {
    
    private TipoPagamento pagamento;

    public Pedido() {
        this.pagamento = pagamento;
    }
    
    public Pedido(TipoPagamento pagamento) {
        this.pagamento = pagamento;
    }

    
    public TipoPagamento getPagamento() {
        return pagamento;
    }

    
    public void setPagamento(TipoPagamento pagamento) {
        this.pagamento = pagamento;
    }
    
    public boolean Pagar(int op)
    {
        switch(op)
        {
        
            case 1:
                
                this.pagamento = pagamento.DINHEIRO;
                
                return true;
                
                
                
            case 2:
                
                this.pagamento = pagamento.CHEQUE;
                
                return true;
                
                
                
            case 3:
                
                this.pagamento = pagamento.CARTÃO;
                
                return true;
            
                
                
            default:
            
                System.out.println("opção invalida");
                
                return false;
            
                
        
            
        }
    }
}