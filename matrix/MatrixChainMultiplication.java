package Final;

class MatrixChainMultiplication
{

 static int MatrixChainOrder(int p[], int i, int j)
 {
     if (i == j)
         return 0;

     int min = Integer.MAX_VALUE;

     for (int k=i; k<j; k++)
     {
         int count = MatrixChainOrder(p, i, k) +
                     MatrixChainOrder(p, k+1, j) +
                     p[i-1]*p[k]*p[j];

         if (count < min)
             min = count;
         //System.out.println("min: "+min);
         //System.out.println("k: "+k);
     }
     
     // Return minimum count
     return min;
 }

 // Driver program to test above function
 public static void main(String args[])
 {
     int arr[] = new int[] {25,45,15,5,10,25,30};
     //int arr[] = new int[] {30,35,15,5,10,20,25};
     int n = arr.length;
     
     System.out.println("Minimum number of multiplications is "+
                        MatrixChainOrder(arr, 1, n-1));
     for(int i=1;i<arr.length;i++){
    	 for(int j=i;j<arr.length;j++){
    		 System.out.println("["+i+","+j+"]"+
                        MatrixChainOrder(arr, i, j));
    	 }
    	 
     }

 }
}