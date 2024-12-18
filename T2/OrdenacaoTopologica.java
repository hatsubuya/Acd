import java.util.*;

public class OrdenacaoTopologica 
{

    public static List<Integer> ord(Digrafo grafo, int numVertices) 
    {

        boolean[] visitado = new boolean[numVertices];

        Stack<Integer> pilha = new Stack<>();


        for (int i = 0; i < numVertices; i++) 
        {
            
            if (!visitado[i]) 
            {
                
                dfs(grafo, i, visitado, pilha, numVertices);
                
            }
        }

        
        List<Integer> ordem = new ArrayList<>();

        
        while (!pilha.isEmpty()) 
        {
            
            ordem.add(pilha.pop());
            
        }

        return ordem;
    
    }

    private static void dfs(Digrafo grafo, int vertice, boolean[] visitado, Stack<Integer> pilha, int numVertices) 
    {
        
        visitado[vertice] = true;

        
        if (grafo.usarMatriz) 
        {
            

            for (int i = 0; i < numVertices; i++) 
            {
                
                if (grafo.matrizAdjacencia[vertice][i] != 0 && !visitado[i]) 
                {
                    
                    dfs(grafo, i, visitado, pilha, numVertices);
                
                }
            
                
            }

        }
        
            else 
            {
            
                for (Digrafo.Aresta aresta : grafo.obterArestas(vertice)) 
                {
                    if (!visitado[aresta.destino]) 
                    {
                        dfs(grafo, aresta.destino, visitado, pilha, numVertices);
                    }
                }
            }

        
        pilha.push(vertice);
    }
}