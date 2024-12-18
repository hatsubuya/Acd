import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Ordenadores
{
    
    public static <T extends Comparable<T>> void bubbleSort(List<T> list)
    {
        
        int n = list.size();
        
        boolean swapped;

        for (int i = 0; i < n - 1; i++)
        {
            
            swapped = false;
            
            for (int j = 0; j < n - i - 1; j++)
            {
                
                if (list.get(j).compareTo(list.get(j + 1)) > 0)
                {
                    
                    T temp = list.get(j);
                    
                    list.set(j, list.get(j + 1));
                    
                    list.set(j + 1, temp);
                    
                    swapped = true;
                }
            }
            
            if (!swapped) break;
        }
    }




    public static <T extends Comparable<T>> void insertionSort(List<T> list)
    {
        
        int n = list.size();

        for (int i = 1; i < n; i++)
        {
            T key = list.get(i);
            
            int j = i - 1;

            
            while (j >= 0 && list.get(j).compareTo(key) > 0)
            {
                
                list.set(j + 1, list.get(j));
                
                j--;
                
            }
            
            list.set(j + 1, key);
            
        }
        
    }
    
    
    
    public static <T extends Comparable<T>> void selectionSort(List<T> list) 
    {
        
        int n = list.size();

        for (int i = 0; i < n - 1; i++) 
        {
            
            int minIndex = i;
            
            for (int j = i + 1; j < n; j++) 
            {
                if (list.get(j).compareTo(list.get(minIndex)) < 0) 
                {
                    
                    minIndex = j;
                    
                }
            }

           
            T temp = list.get(minIndex);
            
            list.set(minIndex, list.get(i));
            
            list.set(i, temp);
        }
    }



    public static <T extends Comparable<T>> void shellSort(List<T> list) 
    {
        
        int n = list.size();
        
       
        for (int gap = n / 2; gap > 0; gap /= 2) 
        {
            
            for (int i = gap; i < n; i++) 
            {
                
                T temp = list.get(i);
                
                int j;
                
                for (j = i; j >= gap && list.get(j - gap).compareTo(temp) > 0; j -= gap) 
                {
                    
                    list.set(j, list.get(j - gap));
                    
                }
                
                list.set(j, temp);
            }
        }
    }
    
    
    public static <T extends Comparable<T>> void heapSort(List<T> list) 
    {
        
        int n = list.size();

        
        for (int i = n / 2 - 1; i >= 0; i--) 
        {
            
            heapify(list, n, i);
            
        }

      
        for (int i = n - 1; i > 0; i--) 
        {


            T temp = list.get(0);
            
            list.set(0, list.get(i));
            
            list.set(i, temp);
            

            heapify(list, i, 0);
        }
    }

    
    
    private static <T extends Comparable<T>> void heapify(List<T> list, int n, int i) 
    {
        
        int largest = i;
        
        int left = 2 * i + 1;
        
        int right = 2 * i + 2;

        
        if (left < n && list.get(left).compareTo(list.get(largest)) > 0) 
        {
            
            largest = left;
            
        }


        if (right < n && list.get(right).compareTo(list.get(largest)) > 0) 
        {
            
            largest = right;
            
        }

        
        if (largest != i) 
        {
            
            T swap = list.get(i);
            
            list.set(i, list.get(largest));
            
            list.set(largest, swap);

            heapify(list, n, largest);
        }
    }
    
    
    public static <T extends Comparable<T>> void mergeSort(List<T> list)
    {
        
        if (list.size() <= 1)
        {
            return;
        }

        
        int mid = list.size() / 2;
        
        List<T> left = new ArrayList<>(list.subList(0, mid));
        
        List<T> right = new ArrayList<>(list.subList(mid, list.size()));

        
        mergeSort(left);
        
        mergeSort(right);

        
        merge(list, left, right);
        
    }

    private static <T extends Comparable<T>> void merge(List<T> list, List<T> left, List<T> right) 
    {
        
        int i = 0, j = 0, k = 0;

        
        while (i < left.size() && j < right.size()) 
        {
            
            if (left.get(i).compareTo(right.get(j)) <= 0) 
            {
                
                list.set(k++, left.get(i++));
                
            } 
            
            else 
            {
                list.set(k++, right.get(j++));
            }
        }

        
        while (i < left.size())
        {
            
            list.set(k++, left.get(i++));
            
        }

   
        while (j < right.size())
        {
            
            list.set(k++, right.get(j++));
        }
    }
    
    
    public static <T extends Comparable<T>> void quickSort(List<T> list)
    {
        
        quickSort(list, 0, list.size() - 1);
        
    }

    private static <T extends Comparable<T>> void quickSort(List<T> list, int low, int high) 
    {
        if (low < high)
        {
            
            int pivotIndex = partition(list, low, high);

            
            quickSort(list, low, pivotIndex - 1);
            
            quickSort(list, pivotIndex + 1, high);
            
        }
    }

    
    private static <T extends Comparable<T>> int partition(List<T> list, int low, int high) 
    {
        
        T pivot = list.get(high);
        
        int i = low - 1;

        for (int j = low; j < high; j++) 
        {
            if (list.get(j).compareTo(pivot) <= 0) 
            {
                
                i++;


                T temp = list.get(i);
                
                list.set(i, list.get(j));
                
                list.set(j, temp);
                
            }
        }

        
        T temp = list.get(i + 1);
        
        list.set(i + 1, list.get(high));
        
        list.set(high, temp);

        return i + 1;
    }

   
    public static void radixSort(ArrayList<Integer> list) 
    {
        
        if (list == null || list.isEmpty())
        {
            return;
        }
        
        if (!(list.get(0) instanceof Integer)) 
        {
            
            throw new IllegalArgumentException("O vetor deve conter apenas Integers.");
        
        }

        
        int max = Collections.max(list);
        
        
        for (int exp = 1; max / exp > 0; exp *= 10)
        {
            countingSortByDigit(list, exp);
        }
    }

    private static void countingSortByDigit(ArrayList<Integer> list, int exp) 
    {
        
        int n = list.size();
        
        ArrayList<Integer> output = new ArrayList<>(Collections.nCopies(n, 0));
        
        int[] count = new int[10];

        for (int i = 0; i < n; i++) 
        {
            
            count[(list.get(i) / exp) % 10]++;
        
        }

        for (int i = 1; i < 10; i++) 
        {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) 
        {
            output.set(count[(list.get(i) / exp) % 10] - 1, list.get(i));
            
            count[(list.get(i) / exp) % 10]--;
        }

        for (int i = 0; i < n; i++) 
        {
            list.set(i, output.get(i));
        }
    }
    
    public static void countingSort(ArrayList<Integer> list) 
    {
        
        if (list == null || list.isEmpty())
        {
            
            return;
            
        }
        
        
        if (!(list.get(0) instanceof Integer)) 
        {
            throw new IllegalArgumentException("O vetor deve conter apenas Integers.");
        }


        int min = Collections.min(list);
        
        int max = Collections.max(list);

        int range = max - min + 1;
        
        int[] count = new int[range];
        
        
        for (int i = 0; i < list.size(); i++) 
        {
            count[list.get(i) - min]++;
        }

        int index = 0;
        
        for (int i = 0; i < range; i++) 
        {
            while (count[i] > 0) 
            {
                list.set(index++, i + min);
                
                count[i]--;
            }
        }
    }
  
  
    public static void bucketSort(ArrayList<Integer> list) 
    {
        
        if (list == null || list.isEmpty())
        {
            return;
        }
        
        
        if (!(list.get(0) instanceof Integer)) 
        {
            throw new IllegalArgumentException("O vetor deve conter apenas Integers.");
        }

        
        int minValue = Collections.min(list);
        
        int maxValue = Collections.max(list);

        
        int bucketCount = (maxValue - minValue) / list.size() + 1;
        
        ArrayList<ArrayList<Integer>> buckets = new ArrayList<>(bucketCount);
        
        
        for (int i = 0; i < bucketCount; i++) 
        {
            buckets.add(new ArrayList<>());
        }

        
        for (int i = 0; i < list.size(); i++) 
        {
            int bucketIndex = (list.get(i) - minValue) * (bucketCount - 1) / (maxValue - minValue);
            
            buckets.get(bucketIndex).add(list.get(i));
        }

        
        for (ArrayList<Integer> bucket : buckets) 
        {
            Collections.sort(bucket);
        }

        
        list.clear();
        
        for (ArrayList<Integer> bucket : buckets) 
        {
            list.addAll(bucket);
        }
    }

}
