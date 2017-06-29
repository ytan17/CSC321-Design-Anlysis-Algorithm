package hw5;

import java.util.Random;

public class QUICKSORT2 extends sorter{

	static int partition (int a[], int l, int h)
    {
        int x = a[h];
        int i = (l - 1);
 
        for (int j = l; j <= h- 1; j++)
        {
            if (a[j] <= x)
            {
                i++;
                // swap a[i] and a[j]
                swap(a,i,j);
            }
        }
        // swap a[i+1] and a[h]
        swap(a,i+1,h);
        return (i + 1);
    }
	 

    static void qSort(int a[], int l, int h)
    {
        int stack[] = new int[h-l+1];
 
        // initialize top of stack
        int top = -1;
 
        // push initial values
        stack[++top] = l;
        stack[++top] = h;
 
        //pop until stack empty
        while (top >= 0)
        {
            h = stack[top--];
            l = stack[top--];

            int p = partition(a, l, h);
 
            if ( p-1 > l )
            {
                stack[ ++top ] = l;
                stack[ ++top ] = p - 1;
            }
 
            if ( p+1 < h )
            {
                stack[ ++top ] = p + 1;
                stack[ ++top ] = h;
            }
       }

    }
    
    public static void main(String[] args) {
		int[] descList = new int[500];
		//int[] descList = new int[1000];
		//int[] descList = new int[5000];

		for(int j=0;j<descList.length;j++){
			descList[j]=descList.length-j;
		}
		
		int[] sameNumList = new int[500];
		//int[] sameNumList = new int[1000];
		//int[] sameNumList = new int[5000];
		for(int j=0;j<sameNumList.length;j++){
			sameNumList[j]=1;
		}
		
		int[] ascList = new int[500];
		//int[] ascList = new int[1000];
		//int[] ascList = new int[5000];
		for(int j=0;j<ascList.length;j++){
			ascList[j]=ascList.length-j;
		}
	
		int[] randList = new int[500];
		//int[] randList = new int[1000];
		//int[] randList = new int[5000];
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
