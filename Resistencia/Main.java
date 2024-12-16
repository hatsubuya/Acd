/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
	    
		Resistor r1 = new Resistor(100);
		
        Resistor r2 = new Resistor(200);
        
        Resistor r3 = new Resistor(50);

        
        Serial serialCircuit = new Serial(Arrays.asList(r1, r2, r3));
        
        double seriesResistance = serialCircuit.getResistance();
        
        System.out.println("resistencia em serie: " + seriesResistance + " ohms");

       
        Parallel parallelCircuit = new Parallel(Arrays.asList(r1, r2, r3));
        
        double parallelResistance = parallelCircuit.getResistance();
        
        System.out.println("resistencia paralela " + parallelResistance + " ohms");
	}
}
