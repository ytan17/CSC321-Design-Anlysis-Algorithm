package hw5;

import java.util.Random;

public class QUICKSORT1 extends INSERTIONSORT{

	public static void quickSort1(int[] a, int low, int high){
		if(a == null || a.length == 0) return;
		if(low>=high)  return;
		
		if(a.length<500)
			insertionSort(a);
		else{
			int middle = low + (high - low) /2;
			int pivot = a[middle];
			
			int i = low, j = high;
			while(i<=j){
				while(a[i]<pivot){
					i++;
				}
				while(a[j]>pivot){
					j--;
				}
				if(i<=j){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					i++;
					j--;
				}
			}
			
			if(low < j)
				quickSort1(a,low,j);
			if(high > i)
				quickSort1(a,i,high);
		}
	}
	
	public static void main(String[] args){
		int[] descList = new int[500];
		//int[] descList = new int[1000];
		//int[] descList = new int[5000];
		//int[] descList = new int[1000000];
		for(int j=0;j<descList.length;j++){
			descList[j]=descList.length-j;
		}
		
		
		int[] sameNumList = new int[500];
		//int[] sameNumList = new int[1000];
		//int[] sameNumList = new int[5000];
		//int[] sameNumList = new int[1000000];
		for(int j=0;j<sameNumList.length;j++){
			sameNumList[j]=1;
		}
		
		
		int[] ascList = new int[500];
		//int[] ascList = new int[1000];
		//int[] ascList = new int[5000];
		//int[] ascList = new int[1000000];
		for(int j=0;j<ascList.length;j++){
			ascList[j]=ascList.length-j;
		}
	
		int[] randList = new int[500];
		//int[] randList = new int[1000];
		//int[] randList = new int[5000];
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
		quickSort1(descList,low,high1);
		System.out.println("Time spend in descList: " +(System.currentTimeMillis()-time1));
		
		long time2 = System.currentTimeMillis();
		quickSort1(sameNumList,low,high2);
		System.out.println("Time spend in sameNumList: " +(System.currentTimeMillis()-time2));
		
		long time3 = System.currentTimeMillis();
		quickSort1(ascList,low,high3);
		System.out.println("Time spend in ascList: " +(System.currentTimeMillis()-time3));
		
		long time4 = System.currentTimeMillis();
		quickSort1(randList,low,high4);
		System.out.println("Time spend in randList: " +(System.currentTimeMillis()-time4));


	}


}
