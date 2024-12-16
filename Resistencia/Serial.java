import java.util.List;

public class Serial extends Resistor {
    
    private List<Resistor> resistorsInSeries;

    public Serial(List<Resistor> resistorsInSeries) {
        
        super(0);
        
        this.resistorsInSeries = resistorsInSeries;
        
    }

    @Override
    public double getResistance() {
        
        double totalResistance = 0;
        
        for (Resistor resistor : resistorsInSeries) {
            
            totalResistance += resistor.getResistance();
            
        }
        
        return totalResistance;
    }
}