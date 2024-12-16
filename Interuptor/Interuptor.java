public class Interuptor
{
    Lampada lampada;
    
    Interuptor(Lampada lampada){
        
        this.lampada=lampada;
    }
    
    public void fecharCircuito()
    {
        lampada.desenergizar();
    }
    
    public void abrirCircuito()
    {
        lampada.energizar();
    }
    
}