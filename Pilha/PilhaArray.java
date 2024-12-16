import java.util.ArrayList;

public class PilhaArray implements PilhaInteiros {
    
    private ArrayList<Integer> pilha;

    public PilhaArray() {
        
        pilha = new ArrayList<>();
        
    }
    
    @Override
    public void empilha(int n) {
        
        pilha.add(n);
    }
    
    
    @Override
    public void desempilha() {
        
        if (!vazia()) {
            
            pilha.remove(pilha.size() - 1);
        }
        
        else {
            
            System.out.println("A pilha está vazia");
        }
    }


    @Override
    public boolean vazia() {
        
        return pilha.isEmpty();
    }

    
    @Override
    public int consulta() {
        
        if (!vazia()) {
            
            return pilha.get(pilha.size() - 1);
            
        } 
        
        else {
            
            throw new IllegalStateException("A pilha está vazia");
            
        }
    }
}