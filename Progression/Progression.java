public abstract class Progression {
    
    protected long first;
    
    protected long cur;

    public Progression(long first, long cur) {
        
        this.first = first;
        
        this.cur = cur;
        
    }

    protected abstract long nextValue();

    protected void printProgression(int n) {
        
        System.out.print(first + " ");
        
        for (int i = 1; i < n; i++) {
            
            System.out.print(nextValue() + " ");
            
        }
        
        System.out.println();
    }
}