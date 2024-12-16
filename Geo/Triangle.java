public class Triangle extends GeometricFigure implements SidedObject {
    
    public Triangle(double base, double height) {
        
        super(height, base, "Triangle");
        
    }

    @Override
    public double area() {
        
        return 0.5 * height * width;
        
    }

    @Override
    public int displaySides() {
        
        return 3;
    }
}