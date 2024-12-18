import java.util.*;

public class FluxoMaximo {
    
    public static int algford(Digrafo grafo, int fonte, int destino) 
    {
        
        int numVertices = grafo.numVertices;
        
        int[][] capacidade = new int[numVertices][numVertices];
        
        
        for (int i = 0; i < numVertices; i++) 
        {
            for (Digrafo.Aresta aresta : grafo.obterArestas(i)) 
            {
                
                capacidade[i][aresta.destino] = aresta.peso;
            
                
            }
        }
        
        
        
        int[][] fluxo = new int[numVertices][numVertices];
        
        int fluxoMaximo = 0;
        
        int[] caminho;
        
        
        
        
        while ((caminho = bfs(capacidade, fluxo, fonte, destino)) != null) 
        {
        
            int fluxoCaminho = Integer.MAX_VALUE;
            
            for (int v = destino; v != fonte; v = caminho[v]) 
            {
                
                int u = caminho[v];
                
                fluxoCaminho = Math.min(fluxoCaminho, capacidade[u][v] - fluxo[u][v]);
            
                
            }
            
        
            for (int v = destino; v != fonte; v = caminho[v]) 
            {
                
                int u = caminho[v];
                
                fluxo[u][v] += fluxoCaminho;
                
                fluxo[v][u] -= fluxoCaminho;
            }
            
            fluxoMaximo += fluxoCaminho;
            
        }
        
        return fluxoMaximo;
    }
    
    private static int[] bfs(int[][] capacidade, int[][] fluxo, int fonte, int destino) 
    {
        
        int[] caminho = new int[capacidade.length];
        
        for (int i = 1; i < caminho.length; i++) 
        {
            caminho[i] = -1;
        }
        
        Queue<Integer> fila = new LinkedList<>();
        
        fila.add(fonte);
        
        caminho[fonte] = -2;
        
        while (!fila.isEmpty()) 
        {
            
            int u = fila.poll();
            
            for (int v = 0; v < capacidade.length; v++) 
            {
                
                if (caminho[v] == -1 && capacidade[u][v] - fluxo[u][v] > 0) 
                {
                    fila.add(v);
                    
                    caminho[v] = u;
                    
                    if (v == destino) 
                    {
                        
                        return caminho;
                    
                        
                    }
                }
            }
        }
        
        return null;
    }
}