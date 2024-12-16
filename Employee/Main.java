/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		
        Employee employee1 = new Employee("giorno", "giovanna", 3000.00);
        
        Employee employee2 = new Employee("Jean", "pierre", -1500.00);

        
        System.out.println("Valores originais:");
        
        System.out.printf("%s %s: R$ %.2f\n", employee1.getNome(), employee1.getSobrenome(), employee1.getSalarioAnual());
        System.out.printf("%s %s: R$ %.2f\n", employee2.getNome(), employee2.getSobrenome(), employee2.getSalarioAnual());

        
        employee1.Aumento(10);
        
        employee2.Aumento(10);

    
        System.out.println("Valores apos 10% de aumento:");
        
        System.out.printf("%s %s: R$ %.2f\n", employee1.getNome(), employee1.getSobrenome(), employee1.getSalarioAnual());
        System.out.printf("%s %s: R$ %.2f\n", employee2.getNome(), employee2.getSobrenome(), employee2.getSalarioAnual());
	}
}
