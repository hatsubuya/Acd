/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    
		PilhaInteiros pilha = new PilhaArray();

        System.out.println("esta vazio? " + pilha.vazia());

        System.out.println("Empilhando: 40, 30, 50");
        
        pilha.empilha(40);
        
        pilha.empilha(30);
        
        pilha.empilha(50);

        System.out.println("top: " + pilha.consulta());

        System.out.println("desempilhando....:");
        
        pilha.desempilha();
        
        System.out.println("top: " + pilha.consulta());

        System.out.println("desempilhando...........");
        
        pilha.desempilha();
        
        System.out.println("top: " + pilha.consulta());
        
        pilha.desempilha();

        System.out.println("vazia? " + pilha.vazia());

        try {
            
            pilha.consulta();
        }
        catch (IllegalStateException e) {
            System.out.println("Erro  " + e.getMessage());
        }
	}
}
