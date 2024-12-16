public class Planador extends Aeronave {
    
    protected boolean SeCaboDeReboqueAclopado;

    
    public void soltarCaboDeReboque() {
        
        if (SeCaboDeReboqueAclopado) {
            
            SeCaboDeReboqueAclopado = false;
            
            System.out.println("Cabo de reboque solto.");
        }
        
        else {
            
            System.out.println("O cabo de reboque já está solto.");
        }
    }
}