import java.util.Arrays;
import java.util.PriorityQueue;

public class Dijkstra 
{

    public static void dijkstra(Digrafo grafo, int origem) 
    {
        int numVertices = grafo.numVertices;
        
        int[] distancias = new int[numVertices];
        
        for (int i = 1; i < numVertices; i++) 
        {
            distancias[i] = Integer.MAX_VALUE;
        }
        
        distancias[origem] = 0;
        
        boolean[] visitados = new boolean[numVertices];
        
        PriorityQueue<int[]> fila = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        
        fila.add(new int[]{origem, 0});
        
        while (!fila.isEmpty()) 
        {
            int[] atual = fila.poll();
            
            int j = atual[0];

            if (visitados[j]) continue;
            
            visitados[j] = true;
            
            if (grafo.usarMatriz) 
            {
                
                for (int k = 0; k < numVertices; k++) 
                {
                    
                    int peso = grafo.matrizAdjacencia[j][k];
                    
                    if (peso > 0 && distancias[j] + peso < distancias[k]) 
                    {
                        
                        distancias[k] = distancias[j] + peso;
                        
                        fila.add(new int[]{k, distancias[k]});
                        
                    }
                }
                
            }
            
            else 
            {
                
                for (Digrafo.Aresta aresta : grafo.obterArestas(j)) 
                {
                    if (distancias[j] + aresta.peso < distancias[aresta.destino]) 
                    {
                        
                        distancias[aresta.destino] = distancias[j] + aresta.peso;
                        
                        fila.offer(new int[]{aresta.destino, distancias[aresta.destino]});
                    
                        
                    }
                }
            }
            
            
            
            
        }
        //while acaba aqui
        
        imprimir(origem,distancias);
    }
    
    public static void imprimir(int origem,int[] distancias)
    {
        System.out.println("distancias de " + origem + ":");
        
        for (int i = 0; i < distancias.length; i++) 
        {
            
            if (distancias[i] == Integer.MAX_VALUE) 
            {
                
                System.out.println("vertice " + i + ": infinito");
                
            }           
            else 
            {
                System.out.println("vertice " + i + ": " + distancias[i]);
            }
        
            
    
        }
    }
    
}
        /*
       

            
            
            
        }

        
    }
}

*/