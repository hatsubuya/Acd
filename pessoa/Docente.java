public class Docente extends Pessoa {
    
    private double salario;
    
    private String nidi;

    public Docente(String nome, String cpf, double salario, String nidi) {
        
        super(nome, cpf);
        
        this.salario = salario;
        
        this.nidi = nidi;
    }

    
    public double getSalario() {
        
        return salario;
        
    }

    public void setSalario(double salario) {
        
        this.salario = salario;
        
    }

    public String getNidi() {
        
        return nidi;
    }

    public void setNidi(String nidi) {
        
        this.nidi = nidi;
        
    }

    
    @Override
    public String toString() {
        
        return "Docente - Nome: " + getNome() + ", CPF: " + getCpf() + ", Salário: " + salario + ", NIdI: " + nidi ;
    }
}