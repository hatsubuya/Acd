/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class StudentDemo
{
	public static void main(String[] args) {
		
        Student[] students = new Student[6];

  
        students[0] = new UndergraduateStudent("so2003", "cujoh");
        
        students[1] = new GraduateStudent("gw1999", "giovanna");
        
        students[2] = new StudentAtLarge("diu1993", "yoshikage");
        
        students[3] = new UndergraduateStudent("sc1989", "kujo");
        
        students[4] = new GraduateStudent("bt1985", "zapelli");
        
        students[5] = new StudentAtLarge("pb1981", "joestar");

        
        for (Student student : students) {
            System.out.println("ID: " + student.getId());
            
            System.out.println("sobrenome: " + student.getSobrenome());
            
            System.out.println("mensalidade" + student.getMensalidade());
            
            System.out.println("-------------------------------");
        }
	}
}
