package hw5;

import java.util.Random;

public class MERGESORT {

	private static int[] a = new int[5000];
    private static int[] temp = new int[5000];
    private int num;

    public void sort(int[] values) {
        this.a = values;
        num = values.length;
        this.temp = new int[num];
        mergeSort(0, num - 1);
    }

    private static void mergeSort(int low, int high) {
        if (low < high) {
                int middle = low + (high - low) / 2;
                // Sort the left side of the array
                mergeSort(low, middle);
                // Sort the right side of the array
                mergeSort(middle + 1, high);
                // Combine them both
                merge(low, middle, high);
        }
    }

    private static void merge(int low, int middle, int high) {
        for (int i = low; i <= high; i++) {
                temp[i] = a[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;
        
        while (i <= middle && j <= high) {
                if (temp[i] <= temp[j]) {
                        a[k] = temp[i];
                        i++;
                } else {
                        a[k] = temp[j];
                        j++;
                }
                k++;
        }
        while (i <= middle) {
                a[k] = temp[i];
                k++;
                i++;
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
		
		int low = 0;
		int high1 = descList.length-1;
		int high2 = sameNumList.length-1;
		int high3 = ascList.length-1;
		int high4 = randList.length-1;
		
		
		long time1 = System.currentTimeMillis();
		mergeSort(low,high1);
		System.out.println("Time spend in descList: " +(System.currentTimeMillis()-time1));
		
		long time2 = System.currentTimeMillis();
		mergeSort(low,high2);
		System.out.println("Time spend in sameNumList: " +(System.currentTimeMillis()-time2));
		
		long time3 = System.currentTimeMillis();
		mergeSort(low,high3);
		System.out.println("Time spend in ascList: " +(System.currentTimeMillis()-time3));
		
		long time4 = System.currentTimeMillis();
		mergeSort(low,high4);
		System.out.println("Time spend in randList: " +(System.currentTimeMillis()-time4));


	}

}
