/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.ArrayList;
import java.util.List;

public class DemoTurners {
    
    public static void main(String[] args) {
        
        List<Turner> turners = new ArrayList<>();
        
        turners.add(new Leaf());
        turners.add(new Page());
        turners.add(new Pancake());
        
       
        for (Turner turner : turners) {
            
            System.out.println(turner.turn());
            
        }
    }
}
