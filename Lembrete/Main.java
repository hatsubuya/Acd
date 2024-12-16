
public class Main
{
	public static void main(String[] args) {
	    
	    int d = 0;
	    
	    int m = 0;
	    
	    int a = 0;
	    
	    int hr = 0;
	    
	    int min = 0;
	    
	    String desc="default";
	    
		Data data = new Data(d,m,a);
		
		Horario hora = new Horario(hr,min);
		
		Lembrete  lembrete = new Lembrete(desc,data);
		
		Compromisso compromisso = new Compromisso(desc,data,hora);
		
		//teste da data
		///////////////////
		
		data.ajustarData(2,2,2024);
		
		data.mostrarData();
        
      
		
		System.out.println("\n");
		
		data.ajustarData(2,2,2023);
		
		data.mostrarData();
        
        
		
		//teste do horario
		/////////////////
		
		hora.ajustarHorario(2,2);
		
		System.out.println("\n");
		
		hora.ajustarHorario(2,70);
		
		System.out.println("\n");
		
		hora.ajustarHorario(-1,43);
		
		//Compromisso
		/////////////////
		
		hora.ajustarHorario(16,43);
		
		data.ajustarData(25,12,1999);
		
		desc = "bug do milenio";
		
		compromisso.ajustarCompromisso(desc,data,hora);
		
		compromisso.imprimirCompromisso();
		
		System.out.println("\n");
		
		
		
		
		hora.ajustarHorario(22,43);
		
		data.ajustarData(22,11,2018);
		
		desc = "reuniao importante";
		
		compromisso.ajustarCompromisso(desc,data,hora);
		
		compromisso.imprimirCompromisso();
		
		System.out.println("\n");
		
		
		//Lembrete
		///////////////////
		
		data.ajustarData(1,2,2000);
		
		desc = " é primeiro de fevereiro";
		
		lembrete.ajustarLembrete(desc,data);
		
		System.out.println(lembrete.imprimirLembrete());
		
		
		data.ajustarData(1,7,1994);
		
		desc = "it is a good day";
		
		lembrete.ajustarLembrete(desc,data);
		
		System.out.println(lembrete.imprimirLembrete());
		
		
	}
}
