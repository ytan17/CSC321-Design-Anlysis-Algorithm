package hw5;

import java.util.Random;

public class QUICKSORT extends sorter{
	static int partition(int a[], int low, int high)
    {
        int pivot = a[high];
        int i = (low-1); 
        for (int j=low; j<=high-1; j++)
        {
            if (a[j] <= pivot)
            {
                i++;
                
                // swap a[i] and a[j]
                swap(a,i,j);
            }
        }
 
        // swap a[i+1] and a[high] (or pivot)
        swap(a,i+1,high);
 
        return i+1;
    }
 
    static void qSort(int a[], int low, int high)
    {
        if (low < high)
        {
            int pi = partition(a, low, high);
 
            qSort(a, low, pi-1);
            qSort(a, pi+1, high);
        }
    }
    
    public static void main(String[] args) {
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
		Random rand = new Random();
		for(int i=0; i<randList.length; i++){
			randList[i] = rand.nextInt(randList.length)+1;
		}
		
		int low = 0;
		int high1 = descList.length-1;
		int high2 = sameNumList.length-1;
		int high3 = ascList.length-1;
		int high4 = randList.length-1;
		
		long time1 = System.currentTimeMillis();
		qSort(descList,low,high1);
		System.out.println("Time spend in descList: " +(System.currentTimeMillis()-time1));
		
		long time2 = System.currentTimeMillis();
		qSort(sameNumList,low,high2);
		System.out.println("Time spend in sameNumList: " +(System.currentTimeMillis()-time2));
		
		long time3 = System.currentTimeMillis();
		qSort(ascList,low,high3);
		System.out.println("Time spend in ascList: " +(System.currentTimeMillis()-time3));
		
		long time4 = System.currentTimeMillis();
		qSort(randList,low,high4);
		System.out.println("Time spend in randList: " +(System.currentTimeMillis()-time4));
    }
}
