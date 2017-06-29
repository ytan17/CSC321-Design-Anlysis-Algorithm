package hw5;

public abstract class sorter {
	protected static void swap(int[] a, int i, int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	//public abstract <T extends Comparable<? super T>> void sort(T[] a);
}
