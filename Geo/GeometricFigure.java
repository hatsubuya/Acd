public abstract class GeometricFigure {
    
    protected double height;
    
    protected double width;
    
    protected String figureType;
    
    public GeometricFigure(double height, double width, String figureType) {
        
        this.height = height;
    
        this.width = width;
        
        this.figureType = figureType;
        
    }

    
    public abstract double area();
}