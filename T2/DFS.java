import java.util.*;


public class DFS 
{
    
    public static void dfs(Digrafo grafo, int inicio) 
    {
        
        boolean[] visitado = new boolean[grafo.numVertices];
        
        Stack<Integer> pilha = new Stack<>();

        pilha.push(inicio);
        

        System.out.println("inicia em " + inicio + ":");
        

        while (!pilha.isEmpty()) 
        {
            
            int atual = pilha.pop();

            if (!visitado[atual]) 
            {
                
                visitado[atual] = true;
                
                System.out.print(atual + " ");

                if (grafo.usarMatriz)
                {
                    
                    for (int i = grafo.numVertices - 1; i >= 0; i--) 
                    {
                        
                        if (grafo.matrizAdjacencia[atual][i] != 0) 
                        {
                            
                            pilha.push(i);
                            
                        }
                    }
                }
                
                else 
                {
                    
                    for (Digrafo.Aresta aresta : grafo.obterArestas(atual))
                    {
                        
                        pilha.push(aresta.destino);
                    
                    }
                }
            }
        }
        
        System.out.println();
        
    }
}