import java.util.*;


public class BFS
{
    
    public static void bfs(Digrafo grafo, int inicio)
    {
        
        boolean[] visitados = new boolean[grafo.numVertices];
        
        Queue<Integer> fila = new LinkedList<>();

        fila.add(inicio);
        
        visitados[inicio] = true;
        
        

        System.out.println("inicia em " + inicio + ":");

        while (!fila.isEmpty())
        {
            
            int atual = fila.poll();
            
            System.out.print(atual + " ");
            
            List<Digrafo.Aresta> vizinhos = new ArrayList<>();
            
            if (grafo.usarMatriz)
            {
                for (int i = 0; i < grafo.numVertices; i++)
                {
                    
                    if (grafo.matrizAdjacencia[atual][i] != 0)
                    { 
                    
                        vizinhos.add(new Digrafo.Aresta(atual, i, grafo.matrizAdjacencia[atual][i]));
                    
                        
                    }
                }
            } 
            else
            {
            
                vizinhos = grafo.obterArestas(atual);
            }

            
            for (Digrafo.Aresta vizinho : vizinhos)
            {
                if (!visitados[vizinho.destino])
                {
                    fila.add(vizinho.destino);
                    
                    visitados[vizinho.destino] = true;
                
                    
                }
            }
        }
        
        System.out.println();
    }
}