import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {

		String caminhoArquivo = "1.gr";

		List<Integer> numerosCapturados = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);

		int op=0;
                
                int op2=0;

		int i =0;

		int j= 0;

		int max=0;

		long inicio = System.nanoTime();

		long fim = System.nanoTime();
                
                boolean usarMatriz= true;
                
                boolean alg= true;


        do{            

                i=0;
                
                j=0;
                
                max =0;
                
		System.out.println(" \n escolha qual algoritmo deseja executar: \n 1-BFS  \n 2 - DFS \n 3 - Ordenacao Topologica \n 4 - caminho minimo de origem unica para todos os vertices \n 5 - Arvore Geradora Minima \n 6- Floyd Warshall \n 7 - Fluxo Maximo \n 8- executar o experimento\n 9 - para sair \n sua escolha:");
		op = scanner.nextInt();

		switch(op)
		{
		case 5:
		{
                    //mudança para poder operar no netbeans visto que gbd online possui um limite de texto que comprometeri os grafos

                    //caminhoArquivo = "C:\\Users\\sandr\\Desktop\\t2\\Main\\build\\classes\\main\\2.gr";

                    caminhoArquivo = "2.gr";
            
                    break;

		}

		case 8:
		{
                    
                        op2=0;

                        System.out.println("escolha o grafo a ser experimentado: \n por favor entre um valor entre 1 a 15 ao qual corresponde o grafo de menor a maior densidade:");
                        op2 = scanner.nextInt();
                        
                        if(op2<10)
                        {   
                            
                            caminhoArquivo = "0"+op2 + ".gr";
                        
                        }
                        
                        else
                        {
                                caminhoArquivo = op2 + ".gr";
                        }
                        
                        System.out.println("escolha: 1 - para matriz \n 2 - para lista");
                        op2 = scanner.nextInt();
                        
                        if(op2==1)
                        {
                        
                            usarMatriz = true;
                        }
                        
                        else
                        {
                        
                            usarMatriz = false;
                            
                        }
                        
                    
                        //mudança para poder operar no netbeans visto que gbd online possui um limite de texto que comprometeri os grafos

                        
                        //caminhoArquivo = "C:\\Users\\sandr\\Desktop\\t2\\Main\\build\\classes\\main\\"+caminhoArquivo;
                        
			break;

		}

		default:
		{
			caminhoArquivo = "1.gr";
                    
                        //mudança para poder operar no netbeans visto que gbd online possui um limite de texto que comprometeri os grafos

                        //caminhoArquivo = "C:\\Users\\sandr\\Desktop\\t2\\Main\\build\\classes\\main\\1.gr";

			break;
		}
		
		}



	

		try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo)))
		{
			String linha;

			while ((linha = br.readLine()) != null)
			{

				String[] elementos = linha.split(" ");

				for (String elemento : elementos)
				{

					if (elemento.matches("\\d+"))
					{

						numerosCapturados.add(Integer.parseInt(elemento));
					}
				}
			}
		}   catch (IOException e)
		{
			e.printStackTrace();
		}



		Digrafo digrafo = new Digrafo(numerosCapturados.get(0)+1, usarMatriz,numerosCapturados.get(1));

		if(op != 5)
		{
			do
			{

				digrafo.adicionarAresta(numerosCapturados.get(i+6),numerosCapturados.get(i+7),numerosCapturados.get(i+8));

				i=i+3;

			}
			while(i!=numerosCapturados.get(1)*3);

			digrafo.imprimirDigrafo();
		}

		else
		{
			do
			{

				digrafo.adicionarArestaNaoDirecionada(numerosCapturados.get(i+6),numerosCapturados.get(i+7),numerosCapturados.get(i+8));

				i=i+3;

			}
			while(i!=numerosCapturados.get(1)*3);

			digrafo.imprimirGrafoNaoDirecionado();
		}


		switch(op)
		{

		case 1:
		{
                    
			inicio = System.currentTimeMillis();

			BFS.bfs(digrafo, 3);

			fim = System.currentTimeMillis();

			System.out.println(" \n Tempo: " + (fim - inicio) + " ms");

			break;
		}

		case 2:
		{
			inicio = System.currentTimeMillis();

			DFS.dfs(digrafo, 3);

			fim = System.currentTimeMillis();

			System.out.println(" \n Tempo: " + (fim - inicio) + " ms");

			break;
		}

		case 3:
		{
			inicio = System.currentTimeMillis();

			List<Integer> ordemTopologica = OrdenacaoTopologica.ord(digrafo,numerosCapturados.get(0)+1);


			System.out.println("ordenacao topologica:");

			for (int i2 = ordemTopologica.size() - 1; i2 >= 0; i2--)
			{

				System.out.print(ordemTopologica.get(i2) + " ");

			}

			fim = System.currentTimeMillis();

			System.out.println(" \n Tempo: " + (fim - inicio) + " ms");


			break;
		}

		case 4:
		{




                    System.out.println("escolha: \n 1 - executar com o algorimto de dijkstra \n 2 - executar com o algoritmo de bellmaford \n sua escolha:");
                    op2 = scanner.nextInt();
                 
                        
                    if(op2 ==1)
                    {
                        
                            inicio = System.currentTimeMillis();

			    Dijkstra.dijkstra(digrafo, 3);

			    fim = System.currentTimeMillis();

			    System.out.println(" \n Tempo: " + (fim - inicio) + " ms");
                        
                     }
                            
		    else
                    {
                            inicio = System.currentTimeMillis();

			    BellmanFord.bellmanFord(digrafo, 3);

			    fim = System.currentTimeMillis();

			    System.out.println(" \n Tempo: " + (fim - inicio) + " ms");
                        
                        
                    }

			break;
		}

		case 5:
		{
			inicio = System.currentTimeMillis();
                        
                        ArvoreGeradoraMinima.krusk(digrafo);

			//List<Digrafo.Aresta> agm = ArvoreGeradoraMinima.krusk(digrafo);
                        


			//System.out.println("arestas da Arvore Geradora minima:");

			//for (Digrafo.Aresta aresta : agm)
			//{

			//	System.out.println("Origem: " + aresta.origem + ", Destino: " + aresta.destino + ", Peso: " + aresta.peso);

			//}

			fim = System.currentTimeMillis();

			System.out.println(" \n Tempo: " + (fim - inicio) + " ms");

			break;

		}

		case 6:
		{
			inicio = System.currentTimeMillis();

			FloydWarshall.algfloyd(digrafo);

			fim = System.currentTimeMillis();

			System.out.println(" \n Tempo: " + (fim - inicio) + " ms");

			break;
		}

		case 7:
		{
			inicio = System.currentTimeMillis();

			FluxoMaximo fluxoMaximo = new FluxoMaximo();
                                
                       // fluxoMaximo = FluxoMaximo.algford(digrafo, 3, 1);

			System.out.println("Fluxo MC!ximo: " + fluxoMaximo);

			fim = System.currentTimeMillis();

			System.out.println(" \n Tempo: " + (fim - inicio) + " ms");

			break;
		}
		
		case 8:
                                       
		{
                    
                    System.out.println("escolha: \n 1 - executar com o algorimto de dijkstra \n 2 - executar com o algoritmo de bellmaford \n sua escolha:");
                    op2 = scanner.nextInt();
                    
		    do{
                        
                        
                        
                        
                        
                        if(op2 ==1)
                        {
                        
                            inicio = System.currentTimeMillis();

			    Dijkstra.dijkstra(digrafo, 3);

			    fim = System.currentTimeMillis();

			    System.out.println(" \n Tempo: " + (fim - inicio) + " ms");
                        
                        }
                            
		        else
                        {
                            inicio = System.currentTimeMillis();

			    BellmanFord.bellmanFord(digrafo, 3);

			    fim = System.currentTimeMillis();

			    System.out.println(" \n Tempo: " + (fim - inicio) + " ms");
                        
                        
                        }    
                          
                            



			   
		        
		        
		        max++;
		        
		    }while(max<10);
		    
		    break;
		}


		default:
		{
                        System.out.println("opcao invalida");

			break;
		}

		}
        }while(op!=9);    




















	}
}