class FibonacciProgression extends Progression {
    
    protected long prev;


    public FibonacciProgression(long first, long cur) {
        
        super(first, cur);
        
        this.prev = first - cur;
    }

   
    protected long nextValue() {
        
        long next = prev + cur;
        
        prev = cur;
        
        cur = next;
        
        return cur;
        
    }
}