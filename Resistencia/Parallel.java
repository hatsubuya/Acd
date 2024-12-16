import java.util.List;

public class Parallel extends Resistor {
    
    private List<Resistor> resistorsInParallel;

    public Parallel(List<Resistor> resistorsInParallel) {
        
        super(0);
        
        this.resistorsInParallel = resistorsInParallel;
    }

    @Override
    public double getResistance() {
        
        double inverseTotal = 0;
        
        for (Resistor resistor : resistorsInParallel) {
            
            inverseTotal += 1 / resistor.getResistance();
            
        }
        
        return 1 / inverseTotal;
    }
}