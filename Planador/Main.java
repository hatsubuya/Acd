
public class Main
{
	public static void main(String[] args) {
	    
	    Aeronave aeronave = new Aeronave();
	    
        System.out.println("rota original: " + aeronave.rota);
        


        aeronave.desviar(45.0);
        
        System.out.println("apos desviar 45 graus: " + aeronave.rota);
        

        Planador planador = new Planador();
        
        planador.SeCaboDeReboqueAclopado = true;
        
        System.out.println("cabo aclopado: " + planador.SeCaboDeReboqueAclopado);


        planador.soltarCaboDeReboque();
        
        System.out.println("cabo solto: " + planador.SeCaboDeReboqueAclopado);


        planador.soltarCaboDeReboque();
		
	}
}
