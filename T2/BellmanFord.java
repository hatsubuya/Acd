import java.util.Arrays;

public class BellmanFord {

    public static void bellmanFord(Digrafo grafo, int origem) 
    {
        
        int numVertices = grafo.numVertices;
        
        int[] distancias = new int[numVertices];
        
        
        
        for (int i = 1; i < numVertices; i++) 
        {
            distancias[i] = Integer.MAX_VALUE;
        }
        
         distancias[origem] = 0;
         
        for (int j = 1; j < numVertices; j++) 
        {
            if (grafo.usarMatriz) 
            {
                for (int k = 0; k < numVertices; k++) 
                {
                    for (int l = 0; l < numVertices; l++) 
                    {
                        int peso = grafo.matrizAdjacencia[k][l];
                        
                        if (peso > 0 && distancias[k] != Integer.MAX_VALUE && distancias[k] + peso < distancias[l]) 
                        {
                            
                            distancias[l] = distancias[k] + peso;
                            
                        }
                        
                        
                    }
                    
                }
                
                
                
            }
            
            else 
            {
                for (int u = 0; u < grafo.numVertices; u++) 
                {
                    for (Digrafo.Aresta aresta : grafo.obterArestas(u)) 
                    {
                        if (distancias[aresta.origem] != Integer.MAX_VALUE && distancias[aresta.origem] + aresta.peso < distancias[aresta.destino]) 
                        {
                            
                            distancias[aresta.destino] = distancias[aresta.origem] + aresta.peso;
                        
                            
                        }
                    }
                }
                
            }
            
            
            
        }
        
        if (grafo.usarMatriz) 
        {
            for (int m = 0; m < numVertices; m++) 
            {
                for (int n = 0; n < numVertices; n++) 
                {
                    int peso = grafo.matrizAdjacencia[m][n];
                    
                    if (peso > 0 && distancias[m] != Integer.MAX_VALUE && distancias[m] + peso < distancias[n]) 
                    {
                        System.out.println("ciclo negativo negativo");
                        
                        return;
                    }
                }
            }
            
        }
        
        else 
        {
            for (int u = 0; u < grafo.numVertices; u++) 
            {
                for (Digrafo.Aresta aresta : grafo.obterArestas(u)) 
                {
                    if (distancias[aresta.origem] != Integer.MAX_VALUE && distancias[aresta.origem] + aresta.peso < distancias[aresta.destino]) 
                    {
                        
                        System.out.println("ciclo negativo negativo");
                        
                        return;
                    }
                }
            }
        }
        
        
        
        imprimir(origem,distancias);
        
        /*
                    
                        
                        
              
            
                
            

        
        
        
     

        
        
*/
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