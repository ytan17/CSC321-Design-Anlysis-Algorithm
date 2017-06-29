package hw5;

import java.util.Random;

public class HEAPSORT extends sorter{
	private static int n;
    public static void sort(int a[])
    {       
        heapSort(a);        
        for (int i = n; i > 0; i--)
        {
            swap(a,0, i);
            n = n-1;
            maxheap(a, 0);
        }
    }      
    public static void heapSort(int a[])
    {
        n = a.length-1;
        for (int i = n/2; i >= 0; i--)
            maxheap(a, i);        
    }     
    public static void maxheap(int a[], int i)
    { 
        int left = 2*i ;
        int right = 2*i + 1;
        int max = i;
        if (left <= n && a[left] > a[i])
            max = left;
        if (right <= n && a[right] > a[max])        
            max = right;
 
        if (max != i)
        {
            swap(a, i, max);
            maxheap(a, max);
        }
    }    
    
    public static void main(String[] args){
		//int[] descList = new int[500];
		//int[] descList = new int[1000];
		int[] descList = new int[5000];
		for(int j=0;j<descList.length;j++){
			descList[j]=descList.length-j;
		}
		
		
		//int[] sameNumList = new int[500];
		//int[] sameNumList = new int[1000];
		int[] sameNumList = new int[5000];
		for(int j=0;j<sameNumList.length;j++){
			sameNumList[j]=1;
		}
		
		
		//int[] ascList = new int[500];
		//int[] ascList = new int[1000];
		int[] ascList = new int[5000];
		for(int j=0;j<ascList.length;j++){
			ascList[j]=ascList.length-j;
		}
	
		//int[] randList = new int[500];
		//int[] randList = new int[1000];
		int[] randList = new int[5000];
		//int[] randList = new int[1000000];
		Random rand = new Random();
		for(int i=0; i<randList.length; i++){
			randList[i] = rand.nextInt(randList.length)+1;
		}
		
		
		
		long time1 = System.currentTimeMillis();
		heapSort(descList );
		System.out.println("Time spend in descList: " +(System.currentTimeMillis()-time1));
		
		long time2 = System.currentTimeMillis();
		heapSort(sameNumList);
		System.out.println("Time spend in sameNumList: " +(System.currentTimeMillis()-time2));
		
		long time3 = System.currentTimeMillis();
		heapSort(ascList);
		System.out.println("Time spend in ascList: " +(System.currentTimeMillis()-time3));
		
		long time4 = System.currentTimeMillis();
		heapSort(randList);
		System.out.println("Time spend in randList: " +(System.currentTimeMillis()-time4));


	}

}
