/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    
	    Person person = new Person("Lucien",42);
	    
	    System.out.println(person.getName());
	    
		System.out.println(person.getAge());
		
		person.setAge(77);
		
		System.out.println(person.getAge());
		
		person.printDetails(person.getName());
	}
}
