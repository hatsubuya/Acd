public class Horista extends Empregado {

    private double valorHora;

    public Horista(String nome, String senha, double valorHora) {
        
        super(nome, senha);
        
        this.valorHora = valorHora;
    }

   
    @Override
    public double valorPagto() {
        
        int horasTrabalhadas = 160; 
        
        return valorHora * horasTrabalhadas;
    }


    public double getValorHora() {
        
        return valorHora;
        
    }


    public void setValorHora(double valorHora) {
        
        this.valorHora = valorHora;
        
    }
}