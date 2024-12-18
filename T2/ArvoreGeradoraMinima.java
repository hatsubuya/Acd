import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArvoreGeradoraMinima 
{

    private static class Subconjunto 
    {
        
        int pai, rank;
    
        
    }

    public static List<Digrafo.Aresta> krusk(Digrafo grafo) 
    {
        List<Digrafo.Aresta> arestas = new ArrayList<>();

        
        for (int i = 0; i < grafo.numVertices; i++) 
        {
            if (!grafo.usarMatriz) 
            {
                
                arestas.addAll(grafo.obterArestas(i));
                
            }
        }

        Collections.sort(arestas, Comparator.comparingInt(a -> a.peso));

        List<Digrafo.Aresta> agm = new ArrayList<>();

        Subconjunto[] subconjuntos = new Subconjunto[grafo.numVertices];
        
        for (int v = 0; v < grafo.numVertices; v++) 
        {
            subconjuntos[v] = new Subconjunto();
            
            subconjuntos[v].pai = v;
            
            subconjuntos[v].rank = 0;
            
        }

        System.out.println("arestas ordenadas:");
        
        for (Digrafo.Aresta aresta : arestas) 
        {
            
            System.out.println("Origem: " + aresta.origem + ", Destino: " + aresta.destino + ", Peso: " + aresta.peso);
            
        }

        for (Digrafo.Aresta aresta : arestas) 
        {
            
            int raizOrigem = encontrar(subconjuntos, aresta.origem);
            
            int raizDestino = encontrar(subconjuntos, aresta.destino);

            if (raizOrigem != raizDestino) 
            {
                
                agm.add(aresta);
                
                unir(subconjuntos, raizOrigem, raizDestino);
            }
        }

        return agm;
    }

    private static int encontrar(Subconjunto[] subconjuntos, int v) 
    {
        
        if (subconjuntos[v].pai != v) 
        {
            
            subconjuntos[v].pai = encontrar(subconjuntos, subconjuntos[v].pai);
        
            
        }
        
        return subconjuntos[v].pai;
    }

    private static void unir(Subconjunto[] subconjuntos, int x, int y) 
    {
        
        int raizX = encontrar(subconjuntos, x);
        
        int raizY = encontrar(subconjuntos, y);

        if (raizX != raizY) 
        {
            
            if (subconjuntos[raizX].rank < subconjuntos[raizY].rank) 
            {
                subconjuntos[raizX].pai = raizY;
                
            }
            
            else if (subconjuntos[raizX].rank > subconjuntos[raizY].rank) 
            {
                
                subconjuntos[raizY].pai = raizX;
            
                
            } 
            
            else 
            {
                subconjuntos[raizY].pai = raizX;
                
                subconjuntos[raizX].rank++;
            }
        }
    }
}