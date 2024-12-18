

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sandr
 */


public class Digrafo 
{
    
    protected boolean usarMatriz; // Chave ao qual a possição define o metodo a ser usado
    
    protected int[][] matrizAdjacencia;// armazena o digrafo em forma de matriz
    
    protected List<List<Aresta>> adjacencia; // armazena o digrafo em forma de lista
    
    public int numVertices;//aloca o numero de vertices
    
    public int numAresta;
    
    public Digrafo(int numVertices, boolean usarMatriz,int numAresta)//inicia construtor
    {
        
        this.numVertices = numVertices;//define o numero de vertices
        
        this.numAresta = numAresta;
        
        this.usarMatriz = usarMatriz;//define qual posição da chave esta em uso

        if (usarMatriz)//procede com o uso de matriz caso a chave esteja ativa 
        {
            
            matrizAdjacencia = new int[numVertices][numVertices];//prepara a matriz
            
            for (int i = 0; i < numVertices; i++) 
            {
                for (int j = 0; j < numVertices; j++)
                {
                    
                    matrizAdjacencia[i][j] = 0; // Inicializa com -1 (sem aresta)
                    
                }
        
            }
        }
        
        else
        {
            adjacencia = new ArrayList<>();//prepara a lista
            
            for (int i = 0; i < numVertices; i++)
            {
                
                adjacencia.add(new ArrayList<>());
            
            }
        }
    }
    
    public static class Aresta 
    {
        
        int origem, destino, peso;

        public Aresta(int origem, int destino, int peso) 
        {
            
            this.origem = origem;
            
            this.destino = destino;
            
            this.peso = peso;
        
        }
    }
    
    public void adicionarAresta(int origem, int destino,int peso)
    {
        
        if (usarMatriz) 
        {
           
            
                matrizAdjacencia[origem][destino] = peso;
                
                //System.out.println(matrizAdjacencia[origem][destino]);
            
        }
        
        else
        {
            
                Aresta aresta = new Aresta(origem, destino, peso);
                
                adjacencia.get(origem).add(aresta);
                
                //listaAdjacencia.get(origem).add(new int(destino, peso));
         
           
        }
        
    }
    
    public List<Aresta> obterArestas(int vertice) 
    {
        
        return adjacencia.get(vertice);
        
    }
    
     public void imprimirDigrafo()
     {
        
         if (usarMatriz)
         {
             
         
            System.out.println("Representação em Matriz de Adjacência:");
            
            for (int i = 0; i < numVertices; i++)
            {
                
                for (int j = 0; j < numVertices; j++)
                {
                    
                    System.out.print(matrizAdjacencia[i][j]+ " ");
                    
                }
                
                System.out.println();
                
            }
        } 

        else
         {
             
         
            System.out.println("Representação em Lista de Adjacência:");
            
            for (int i = 0; i < adjacencia.size(); i++) 
            {
                
                
                
                for (Aresta aresta : adjacencia.get(i))
                {
                    System.out.print("Vértice " + aresta.origem);
                    
                    System.out.print("(" + aresta.destino + ", peso: " + aresta.peso + ") ");
            
                }
                
                System.out.println();
            }
        }
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     public void adicionarArestaNaoDirecionada(int origem, int destino, int peso) 
    {
        
        adicionarAresta(origem, destino, peso);

        
        adicionarAresta(destino, origem, peso);
    }

    
    public void imprimirGrafoNaoDirecionado()
    {
        if (usarMatriz) 
        {
            System.out.println("Representação em Matriz de Adjacência (Não Direcionado):");
            for (int i = 0; i < numVertices; i++) 
            {
                for (int j = 0; j < numVertices; j++) 
                {
                    System.out.print(matrizAdjacencia[i][j] + " ");
                }
                System.out.println();
            }
        } 
        else 
        {
            System.out.println("Representação em Lista de Adjacência (Não Direcionado):");
            for (int i = 0; i < adjacencia.size(); i++) 
            {
                System.out.print("Vértice " + i + ": ");
                for (Aresta aresta : adjacencia.get(i)) 
                {
                    System.out.print("(" + aresta.destino + ", peso: " + aresta.peso + ") ");
                }
                System.out.println();
            }
        }
    }
     
     
     
     
    
}
