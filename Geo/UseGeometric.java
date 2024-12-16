/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class UseGeometric {
    public static void main(String[] args) {
        
    
        GeometricFigure[] figures = new GeometricFigure[2];
    
        figures[0] = new Square(4.0);
        
        figures[1] = new Triangle(6.0, 8.0);
        
        
        for (GeometricFigure figure : figures) {
            
            System.out.println(figure.figureType + " - Área: " + figure.area());
            
            if (figure instanceof SidedObject) {
                
                SidedObject sidedFigure = (SidedObject) figure;
                
                System.out.println(figure.figureType + " - Lados: " + sidedFigure.displaySides());
                
            }
        }
    }
}
