public class UndergraduateStudent extends Student {

    public UndergraduateStudent(String id, String sobrenome) {
        
        super(id, sobrenome);
        
        setMensalidade();
        
    }

   
    @Override
    public void setMensalidade() {
        
        this.mensalidade = 4000.00;
    }
}