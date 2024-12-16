import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Fila<T extends Progression> {
    
    private LinkedList<T> list;


    public Fila() {
        
        list = new LinkedList<>();
        
    }


    public void enqueue(T item) {
        
        list.addLast(item);
        
    }


    public T dequeue() {
        
        if (isEmpty()) {
            
            throw new NoSuchElementException("fila vazia");
        
            
        }
        
        return list.removeFirst();
    }


    public boolean isEmpty() {
        
        return list.isEmpty();
        
    }


    public void printProgressions(int n) {
        
        for (T p : list) {
            
            p.printProgression(n);
            
        }
    }
}