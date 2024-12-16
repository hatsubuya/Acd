/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    
		TrianguloEquilatero triangulo = new TrianguloEquilatero();
		
        triangulo.setMedidaLado(5.0);
        
        System.out.println("area do triangulo equilatero: " + triangulo.calcularArea());
        

        Quadrado quadrado = new Quadrado();
        
        quadrado.setMedidaLado(4.0);
        
        System.out.println("area do quadrado: " + quadrado.calcularArea());
        

        HexagonoRegular hexagono = new HexagonoRegular();
        
        hexagono.setMedidaLado(6.0);
        
        System.out.println("area do hexagono: " + hexagono.calcularArea());
	}
}
