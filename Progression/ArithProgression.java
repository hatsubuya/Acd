public class ArithProgression extends Progression {
    
    protected long inc;


    public ArithProgression(long first, long cur, long inc) {
        
        super(first, cur);
        
        this.inc = inc;
        
    }

  
    protected long nextValue() {
        
        cur += inc;
        
        return cur;
        
    }
    
}