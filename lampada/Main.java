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
	    
	    Lampada lampada = new Lampada();
	    
	    lampada.energizar();
	    
	    if(lampada.mostrarEstado() == true)
	    {
	        
	        System.out.println("esta ligada");
	        
	    }
	    
	    else
	    {
	       System.out.println("esta desligada");
	    }
	    
		
		 lampada.desenergizar();
	    
	    if(lampada.mostrarEstado() == true)
	    {
	        
	        System.out.println("esta ligada");
	        
	    }
	    
	    else
	    {
	       System.out.println("esta desligada");
	    }
		
	}
}
