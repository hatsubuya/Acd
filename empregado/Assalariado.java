public class Assalariado extends Empregado {
 
    private double salario;

 
    public Assalariado(String nome, String senha, double salario) {
        super(nome, senha);
        
        this.salario = salario;
    }

    @Override
    public double valorPagto() {
        
        return salario;
    }

    public double getSalario() {
        
        return salario;
    }

  
    public void setSalario(double salario) {
        
        this.salario = salario;
    }
}