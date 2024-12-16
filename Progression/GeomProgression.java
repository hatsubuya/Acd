public class GeomProgression extends Progression {
    
    protected long base;

 
    public GeomProgression(long first, long cur, long base) {
        
        super(first, cur);
        
        this.base = base;
        
    }

 
    protected long nextValue() {
        
        cur *= base;
        
        return cur;
    }
}