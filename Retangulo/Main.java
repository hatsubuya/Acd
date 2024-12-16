/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    
	    int comp =4;
	    
	    int larg =3;
	
	    Retangulo retangulo = new Retangulo(larg,comp);
	    
	    System.out.println("valores atuais:");
	    
	    System.out.println("Largura"+retangulo.getLargura());
	    
	    System.out.println("comprimento:"+retangulo.getComprimento());
	    
	    
	    retangulo.setLargura(7);
	    
	    retangulo.setComprimento(10);
	    
	    System.out.println();
	    
	    
	    System.out.println("valores atuais - atualizados:");
	    
	    System.out.println("Largura"+retangulo.getLargura());
	    
	    System.out.println("comprimento:"+retangulo.getComprimento());
	    
	    System.out.println();
	    
	    System.out.println("calculos:");
	    
	    System.out.println("Perimentro"+retangulo.calcularPerimetro());
	    
	    System.out.println("Area:"+retangulo.calcularArea());
	    
	    
	    
	    
	
	}
}
