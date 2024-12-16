public class Fatura implements Pagavel {
    
    private double valor;

    
    public Fatura(double valor) {
        
        this.valor = valor;
    }

    
    @Override
    public double valorPagto() {
        
        return valor;
    }
}