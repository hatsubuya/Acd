public class StudentAtLarge extends Student {

    
    public StudentAtLarge(String id, String sobrenome) {
        
        super(id, sobrenome);
        
        setMensalidade();
        
    }

   
    @Override
    public void setMensalidade() {
        
        this.mensalidade = 6000.00;
    }
}