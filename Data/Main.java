/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    int d=0;
	    
	    int m=0;
	    
	    int a=0;
	    
	    int op=12;
	    
	    Data data = new Data(d,m,a);
	    
	    Scanner scanner =  new Scanner(System.in);
	    
	    do{
	        
	        System.out.println("escolha uma opcao:\n 1 -ajustar data  \n 2 - mostrar a data atual \n 0 -sair ");
		    op = scanner.nextInt();
		    
		    switch(op)
		    {
		        case 0:
		        {
		            System.out.println("saindo.....");
		            
		            break;
		        }
		        
		        case 1:
		        {
		            System.out.println("digite o dia:");
		            d = scanner.nextInt();
		            
		            System.out.println("digite o mes:");
		            m = scanner.nextInt();
		            
		            System.out.println("digite o ano:");
		            a = scanner.nextInt();
		    
		            data.ajustarData(d,m,a);
		    
		            
		            break;
		            
		        }
		        

		        
		        case 2:
		        {
		            
		            data.mostrarData();
		            
		            break;
		            
		        }
		      
		        
		        default:{
		            
		            System.out.println("opcao invalida");
		            
		            break;
		        }
		        
		    }
		    
	        
	    }while(op!=0);
	    
		
	}
}
