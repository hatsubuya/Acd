public class Lampada
{
    boolean energizada;
    
    public void energizar(){
    
        energizada =true;
        
    }
    
    public void desenergizar(){
        
        energizada = false;
        
    }
    
    public boolean mostrarEstado(){
        
        return energizada;
    }
    
    
    
}