import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.Random;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        
        long inicio = System.nanoTime();
        long fim = System.nanoTime();
        
        //tamanho do vetor
        
        //vetor em ordem crescente
        
        //vetor em ordem decrescente
        
        //vetor em ordem aleatoria
        
        //teste
        
        ArrayList<Integer> teste1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        
        ArrayList<Integer> teste2 = new ArrayList<>(List.of(5, 4, 3, 2, 1));

        ArrayList<Integer> teste3 = new ArrayList<>(new Random().ints(5, 0, 100).boxed().collect(Collectors.toList()));

        ArrayList<Integer> teste4 = new ArrayList<>(List.of(4, 2, 3, 5, 4, 5, 2));
        
        
        //tamanho 100
        
        ArrayList<Integer> vet1 = new ArrayList<>(IntStream.range(1, 101).boxed().collect(Collectors.toList()));
        
        ArrayList<Integer> vet2 = new ArrayList<>(IntStream.range(1, 101).map(i -> 101 - i).boxed().collect(Collectors.toList()));

        ArrayList<Integer> vet3 = new ArrayList<>(new Random().ints(1, 101).limit(100).boxed().collect(Collectors.toList()));
        
        //tamanho 1000
        
        ArrayList<Integer> vet4 = new ArrayList<>(IntStream.range(1, 1001).boxed().collect(Collectors.toList()));

        ArrayList<Integer> vet5 = new ArrayList<>(IntStream.range(1, 1001).map(i -> 1001 - i).boxed().collect(Collectors.toList()));

        ArrayList<Integer> vet6 = new ArrayList<>(new Random().ints(1, 1001).limit(1000).boxed().collect(Collectors.toList()));
        
        
        //tamanho 10000
        
        ArrayList<Integer> vet7 = new ArrayList<>(IntStream.range(1, 10001).boxed().collect(Collectors.toList()));

        ArrayList<Integer> vet8 = new ArrayList<>(IntStream.range(1, 10001).map(i -> 10001 - i).boxed().collect(Collectors.toList()));

        ArrayList<Integer> vet9 = new ArrayList<>(new Random().ints(1, 10001).limit(10000).boxed().collect(Collectors.toList()));
        
        
        //operadores
        
        int op=0;
        
        int op1=0;
        
        ArrayList<Integer> teste=teste1;
        
        ArrayList<Integer> vet = vet1;
        
        Scanner scanner = new Scanner(System.in);
        
        
            System.out.println(" 1 - verificar funcionamento \n 2 - iniciar experimento");
            op = scanner.nextInt();
        
            switch(op)
            {
            
                case 1:
                
                    System.out.println("escolha um vetor para teste: \n 1- [1,2,3,4,5] \n 2 - [5,4,3,2,1] \n 3- [aleatorio] \n 4-[4,2,3,5,4,5,2]");
                    op1 = scanner.nextInt();
                
                        switch(op1)
                        {
                            
                            case 1:
                                
                                teste=teste1;
                                
                                break;
                                
                            case 2:
                                
                                teste = teste2;
                                
                                break;
                                
                            case 3:
                                
                                teste=teste3;
                                
                                break;
                                
                            case 4:
                                
                                teste=teste4;
                                
                                break;
                                
                            default:
                            
                                System.out.println("opcao invalida, iniciando com opção default 1");
                            
                                break;
                    
                        }
                    
                            //insertionSort
        
                            System.out.println("insertionSort:");
        
                            System.out.println("vetor original:" + teste);
        
                            ArrayList<Integer> copia1 = new ArrayList<>(teste);
        
                            Ordenadores.insertionSort(copia1);
        
                            System.out.println("vetor ordenado:" + copia1);
        
        
                            //bubbleSort
        
                            System.out.println("bubbleSort:");
        
                            System.out.println("vetor original:" + teste);
        
                            ArrayList<Integer> copia2 = new ArrayList<>(teste);
        
                            Ordenadores.bubbleSort(copia2);
        
                            System.out.println("vetor ordenado:" + copia2);
        
        
                            //selectionSort
        
                            System.out.println("selectionSort");
        
                            System.out.println("vetor original:" + teste);
        
                            ArrayList<Integer> copia3 = new ArrayList<>(teste);
        
                            Ordenadores.selectionSort(copia3);
        
                            System.out.println("vetor ordenado:" + copia3);
        
        
                            //shellSort
        
                            System.out.println("shellSort:");
        
                            System.out.println("vetor original:" + teste);
        
                            ArrayList<Integer> copia4 = new ArrayList<>(teste);
        
                            Ordenadores.shellSort(copia4);
        
                            System.out.println("vetor ordenado:" + copia4);
        
    
                            //heapSort
        
                            System.out.println("heapSort:");
        
                            System.out.println("vetor original:" + teste);
        
                            ArrayList<Integer> copia5 = new ArrayList<>(teste);
        
                            Ordenadores.heapSort(copia5);
        
                            System.out.println("vetor ordenado:" + copia5);
        
        
                            //mergeSort
        
                            System.out.println("mergeSort:");
        
                            System.out.println("vetor original:" + teste);
        
                            ArrayList<Integer> copia6 = new ArrayList<>(teste);
        
                            Ordenadores.mergeSort(copia6);
        
                            System.out.println("vetor ordenado:" + copia6);
        
        
                            //quickSort
        
                            System.out.println("quickSort:");
        
                            System.out.println("vetor original:" + teste);
        
                            ArrayList<Integer> copia7 = new ArrayList<>(teste);
        
                            Ordenadores.quickSort(copia7);
        
                            System.out.println("vetor ordenado:" + copia7);
        
        
                            //radixSort
        
                            System.out.println("radixSort:");
        
                            System.out.println("vetor original:" + teste);
        
                            ArrayList<Integer> copia8 = new ArrayList<>(teste);
        
                            Ordenadores.radixSort(copia8);
        
                            System.out.println("vetor ordenado:" + copia8);
        
                            //bucketSort
        
                            System.out.println("bucketSort:");
        
                            System.out.println("vetor original:" + teste);
        
                            ArrayList<Integer> copia9 = new ArrayList<>(teste);
        
                            Ordenadores.bucketSort(copia9);
        
                            System.out.println("vetor ordenado:" + copia9);
        
        
                            //countingSort
        
                            System.out.println("countingSort:");
        
                            System.out.println("vetor original:" + teste);
        
                            ArrayList<Integer> copia10 = new ArrayList<>(teste);
        
                            Ordenadores.countingSort(copia10);
        
                            System.out.println("vetor ordenado:" + copia10);
        
                            break;
                
                case 2:
                
                    System.out.println("escolha um vetor para teste: \n 1- [vetor de ordem crescente com 100 posicoes] \n 2 - [vetor com ordem decrescente com 100 posicoes] \n 3- [vetor com numeros aleatorios com 100 posicoes] \n 4- [vetor de ordem crescente com 1000 posicoes] \n 5 - [vetor com ordem decrescente com 1000 posicoes] \n 6- [vetor com numeros aleatorios com 1000 posicoes] \n 7- [vetor de ordem crescente com 10000 posicoes] \n 8 - [vetor com ordem decrescente com 10000 posicoes] \n 9- [vetor com numeros aleator com 10000 posicoes]");
                    op1 = scanner.nextInt();
                
                        switch(op1)
                        {
                            
                            case 1:
                                
                                vet=vet1;
                                
                                break;
                                
                            case 2:
                                
                                vet = vet2;
                                
                                break;
                                
                            case 3:
                                
                                vet=vet3;
                                
                                break;
                                
                            case 4:
                                
                                vet=vet4;
                                
                                break;
                                
                            case 5:
                                
                                vet=vet5;
                                
                                break;
                                
                            case 6:
                                
                                vet = vet6;
                                
                                break;
                                
                            case 7:
                                
                                vet=vet7;
                                
                                break;
                                
                            case 8:
                                
                                vet=vet8;
                                
                                break;
                                
                            case 9:
                                
                                vet=vet9;
                                
                                break;
                                
                            default:
                            
                                System.out.println("opcao invalida, iniciando com opção default 1");
                            
                                break;
                    
                        }
                        
                            try
                            {
                                EscritaNoArquivo escritor = new EscritaNoArquivo("saida.txt");

                                // Testando BubbleSort
                                System.out.println("Testes para BubbleSort");
                                escritor.escreverLinha("BubbleSort:");
                                for (int i = 0; i < 30; i++) 
                                {
            
                                    ArrayList<Integer> vetCopy = new ArrayList<>(vet);
            
                                    inicio = System.currentTimeMillis();
            
                                    Ordenadores.bubbleSort(vetCopy);
            
                                    fim = System.currentTimeMillis();
            
                                    System.out.println("Execução " + (i + 1) + " - Tempo: " + (fim - inicio) + " ms");
                                    escritor.escreverLinha("Execução " + (i + 1) + " - Tempo: " + (fim - inicio) + " ms");
            
                                }
        
        
                                // Testando insertionSort
                                System.out.println("Testes para insertionSort");
                                escritor.escreverLinha("insertionSort:");
                                for (int i = 0; i < 30; i++) 
                                {
            
                                    ArrayList<Integer> vetCopy = new ArrayList<>(vet);
            
                                    inicio = System.currentTimeMillis();
            
                                    Ordenadores.insertionSort(vetCopy);
            
                                    fim = System.currentTimeMillis();
            
                                    System.out.println("Execução " + (i + 1) + " - Tempo: " + (fim - inicio) + " ms");
                                    escritor.escreverLinha("Execução " + (i + 1) + " - Tempo: " + (fim - inicio) + " ms");

                                }
        
                                // Testando selectionSort
                                System.out.println("Testes para selectionSort");
                                escritor.escreverLinha("selectionSort:");
                                for (int i = 0; i < 30; i++) 
                                {
            
                                    ArrayList<Integer> vetCopy = new ArrayList<>(vet);
            
                                    inicio = System.currentTimeMillis();
            
                                    Ordenadores.selectionSort(vetCopy);
            
                                    fim = System.currentTimeMillis();
            
                                    System.out.println("Execução " + (i + 1) + " - Tempo: " + (fim - inicio) + " ms");
                                    escritor.escreverLinha("Execução " + (i + 1) + " - Tempo: " + (fim - inicio) + " ms");
            
                                }
        
                                // Testando shellSort
                                System.out.println("Testes para shellSort");
                                escritor.escreverLinha("shellSort:");
                                for (int i = 0; i < 30; i++) 
                                {
            
                                    ArrayList<Integer> vetCopy = new ArrayList<>(vet);
            
                                    inicio = System.currentTimeMillis();
            
                                    Ordenadores.shellSort(vetCopy);
            
                                    fim = System.currentTimeMillis();
            
                                    System.out.println("Execução " + (i + 1) + " - Tempo: " + (fim - inicio) + " ms");
                                    escritor.escreverLinha("Execução " + (i + 1) + " - Tempo: " + (fim - inicio) + " ms");

                                }
        
                                // Testando heapSort
                                System.out.println("Testes para heapSort");
                                escritor.escreverLinha("heapSort:");
                                for (int i = 0; i < 30; i++) 
                                {
            
                                    ArrayList<Integer> vetCopy = new ArrayList<>(vet);
            
                                    inicio = System.currentTimeMillis();
            
                                    Ordenadores.heapSort(vetCopy);
            
                                    fim = System.currentTimeMillis();
            
                                    System.out.println("Execução " + (i + 1) + " - Tempo: " + (fim - inicio) + " ms");
                                    escritor.escreverLinha("Execução " + (i + 1) + " - Tempo: " + (fim - inicio) + " ms");
            
                                }
        
                                // Testando mergeSort
                                System.out.println("Testes para mergeSort");
                                escritor.escreverLinha("mergeSort:");
                                for (int i = 0; i < 30; i++) 
                                {
            
                                    ArrayList<Integer> vetCopy = new ArrayList<>(vet);
            
                                    inicio = System.currentTimeMillis();
            
                                    Ordenadores.mergeSort(vetCopy);
            
                                    fim = System.currentTimeMillis();
            
                                    System.out.println("Execução " + (i + 1) + " - Tempo: " + (fim - inicio) + " ms");
                                    escritor.escreverLinha("Execução " + (i + 1) + " - Tempo: " + (fim - inicio) + " ms");
            
                                }
        
                                // Testando quickSort
                                System.out.println("Testes para quickSort");
                                escritor.escreverLinha("quickSort");
                                for (int i = 0; i < 30; i++) 
                                {
            
                                    ArrayList<Integer> vetCopy = new ArrayList<>(vet);
            
                                    inicio = System.currentTimeMillis();
            
                                    Ordenadores.quickSort(vetCopy);
            
                                    fim = System.currentTimeMillis();
            
                                    System.out.println("Execução " + (i + 1) + " - Tempo: " + (fim - inicio) + " ms");
                                    escritor.escreverLinha("Execução " + (i + 1) + " - Tempo: " + (fim - inicio) + " ms");
            
                                }
        
                                // Testando bucketSort
                                System.out.println("Testes para bucketSort");
                                escritor.escreverLinha("bucketSort");
                                for (int i = 0; i < 30; i++) 
                                {
            
                                    ArrayList<Integer> vetCopy = new ArrayList<>(vet);
            
                                    inicio = System.currentTimeMillis();
            
                                    Ordenadores.bucketSort(vetCopy);
            
                                    fim = System.currentTimeMillis();
            
                                    System.out.println("Execução " + (i + 1) + " - Tempo: " + (fim - inicio) + " ms");
                                    escritor.escreverLinha("Execução " + (i + 1) + " - Tempo: " + (fim - inicio) + " ms");
            
                                }
        
        
                                // Testando radixSort
                                System.out.println("Testes para radixSort");
                                escritor.escreverLinha("radixSort");
                                for (int i = 0; i < 30; i++) 
                                {
            
                                    ArrayList<Integer> vetCopy = new ArrayList<>(vet);
            
                                    inicio = System.currentTimeMillis();
            
                                    Ordenadores.radixSort(vetCopy);
            
                                    fim = System.currentTimeMillis();
            
                                    System.out.println("Execução " + (i + 1) + " - Tempo: " + (fim - inicio) + " ms");
                                    escritor.escreverLinha("Execução " + (i + 1) + " - Tempo: " + (fim - inicio) + " ms");
            
                                }
        
                                // Testando countingSort
                                System.out.println("Testes para countingSort");
                                escritor.escreverLinha("countingSort");
                                for (int i = 0; i < 30; i++) 
                                {
            
                                    ArrayList<Integer> vetCopy = new ArrayList<>(vet);
            
                                    inicio = System.currentTimeMillis();
            
                                    Ordenadores.countingSort(vetCopy);
            
                                    fim = System.currentTimeMillis();
            
                                    System.out.println("Execução " + (i + 1) + " - Tempo: " + (fim - inicio) + " ms");
                                    escritor.escreverLinha("Execução " + (i + 1) + " - Tempo: " + (fim - inicio) + " ms");
            
                                }
        

                                escritor.fecharArquivo();
                            }
    
                    catch (IOException e) 
                    {
                        System.out.println("Erro ao escrever no arquivo.");
                        e.printStackTrace();
                    }
                
                
                    break;
                
                default:
            
                    System.out.println("opção invalida");
            
                    break;
            
        
            }
        
        
        
        
        
        
        
     
        
        
       //vetor generico para facilitar testes
        
       
        
        
    
    }
    
    
}