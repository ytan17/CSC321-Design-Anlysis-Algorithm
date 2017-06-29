package hw5;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class INSERTIONSORT {
	
	public static void insertionSort(int[] a){
		for(int i=1;i<a.length;i++){
			int j=i;
			int temp=a[i];
			while(j>0&& temp<(a[j-1])){
				a[j]=a[j-1];
				j--;
			}
			a[j]=temp;
			
		}
	}

	public static void main(String[] args) {
		//int[] descList = new int[500];
		//int[] descList = new int[1000];
		int[] descList = new int[5000];
		//int[] descList = new int[10000];
		for(int j=0;j<descList.length;j++){
			descList[j]=descList.length-j;
		}
		
		
		//int[] sameNumList = new int[500];
		//int[] sameNumList = new int[1000];
		int[] sameNumList = new int[5000];
		//int[] sameNumList = new int[10000];
		for(int j=0;j<sameNumList.length;j++){
			sameNumList[j]=1;
		}
		
		
		//int[] ascList = new int[500];
		//int[] ascList = new int[1000];
		int[] ascList = new int[5000];
		//int[] ascList = new int[10000];
		for(int j=0;j<ascList.length;j++){
			ascList[j]=ascList.length-j;
		}
	
		//int[] randList = new int[500];
		//int[] randList = new int[1000];
		int[] randList = new int[5000];
		//int[] randList = new int[10000];
		Random rand = new Random();
		for(int i=0; i<randList.length; i++){
			randList[i] = rand.nextInt(randList.length)+1;
		}
		
		long time1 = System.currentTimeMillis();
		insertionSort(descList);
		System.out.println("Time spend in descList: " +(System.currentTimeMillis()-time1));
		
		long time2 = System.currentTimeMillis();
		insertionSort(sameNumList);
		System.out.println("Time spend in sameNumList: " +(System.currentTimeMillis()-time2));
		
		long time3 = System.currentTimeMillis();
		insertionSort(ascList);
		System.out.println("Time spend in ascList: " +(System.currentTimeMillis()-time3));
		
		long time4 = System.currentTimeMillis();
		insertionSort(randList);
		System.out.println("Time spend in randList: " +(System.currentTimeMillis()-time4));
	}

}
