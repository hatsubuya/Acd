public class Square extends GeometricFigure implements SidedObject {
    
    
    public Square(double sideLength) {
        
        super(sideLength, sideLength, "Square");
        
    }

    @Override
    public double area() {
        
        return height * width;
        
    }

    @Override
    public int displaySides() {
        
        return 4;
    }
}