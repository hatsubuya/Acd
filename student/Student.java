public abstract class Student {
    
    protected String id;
    
    protected String sobrenome;
    
    protected double mensalidade;

    
    public Student(String id, String sobrenome) {
        
        this.id = id;
        
        this.sobrenome = sobrenome;
        
    }

    public String getId() {
        
        return id;
        
    }

    public void setId(String id) {
        
        this.id = id;
        
    }

    public String getSobrenome() {
        
        return sobrenome;
        
    }

    public void setSobrenome(String sobrenome) {
        
        this.sobrenome = sobrenome;
        
    }

    public double getMensalidade() {
        
        return mensalidade;
        
    }

    
    public abstract void setMensalidade();
}