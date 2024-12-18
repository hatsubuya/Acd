import java.util.Arrays;

public class FloydWarshall {

    public static void algfloyd(Digrafo grafo) 
    {
        int numVertices = grafo.numVertices;

        int[][] distancias = new int[numVertices][numVertices];

        for (int i = 0; i < numVertices; i++) 
        {
            
            for (int j = 0; j < numVertices; j++) 
            {
                
                if (grafo.usarMatriz) 
                {
                    
                    if (grafo.matrizAdjacencia[i][j] != 0) 
                    {
                        
                        distancias[i][j] = grafo.matrizAdjacencia[i][j];
                    
                        
                    } 
                    
                    else if (i != j) 
                    {
                        
                        distancias[i][j] = Integer.MAX_VALUE;
                    
                        
                    } 
                    
                    else 
                    {
                        
                        distancias[i][j] = 0;
                        
                    }
                    
                }
                
                    else 
                    {
                
                        if (i == j) 
                        {
                            distancias[i][j] = 0;
                        } 
                        
                        else 
                        {
                            
                            distancias[i][j] = Integer.MAX_VALUE;
                        }

                    for (Digrafo.Aresta aresta : grafo.obterArestas(i)) 
                    {
                        if (aresta.destino == j) 
                        {
                            
                            distancias[i][j] = aresta.peso;
                            
                            break;
                        }
                    }
                }
            }
        }

        for (int k = 0; k < numVertices; k++) 
        {
            
            for (int i = 0; i < numVertices; i++) 
            {
                
                for (int j = 0; j < numVertices; j++) 
                {
                    
                
                    if (distancias[i][k] != Integer.MAX_VALUE && distancias[k][j] != Integer.MAX_VALUE && distancias[i][k] + distancias[k][j] < distancias[i][j]) 
                    {
                        
                        distancias[i][j] = distancias[i][k] + distancias[k][j];
                    
                        
                    }
                }
            }
        }

        System.out.println("distancia minima:");
        
        for (int i = 0; i < numVertices; i++) 
        {
            
            for (int j = 0; j < numVertices; j++) 
            {
                
                if (distancias[i][j] == Integer.MAX_VALUE) 
                {
                    
                    System.out.print("INF ");
                
                    
                } 
                
                else 
                {
                    
                    System.out.print(distancias[i][j] + " ");
                
                    
                }
            }
            
            System.out.println();
        }
    }
}