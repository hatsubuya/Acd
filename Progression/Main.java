/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Main
{
	public static void main(String[] args) {
	

     
        Fila<ArithProgression> filaAritmetica = new Fila<>();
        
        filaAritmetica.enqueue(new ArithProgression(1, 1, 3));
        
        Fila<GeomProgression> filaGeom = new Fila<>();
        
        filaGeom.enqueue(new GeomProgression(2, 2, 2));
        
        Fila<FibonacciProgression> filaFibo = new Fila<>();
        
        filaFibo.enqueue(new FibonacciProgression(0, 1));

   
        filaAritmetica.printProgressions(5);
        
        filaGeom.printProgressions(5);   
        
        filaFibo.printProgressions(7);
        

       
        filaAritmetica.dequeue();

      
        filaAritmetica.printProgressions(5);
	}
}
