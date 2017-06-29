package hw5;


import java.util.Arrays;

//complexity: O(n^2)

class sumOfTriples extends QUICKSORT1
{
     
    boolean findTripkes(int A[], int arr_size, int sum) 
    {
        int k, r;
        quickSort1(A, 0, arr_size - 1);
        //System.out.println("Sorted Array: "+Arrays.toString(A));
 
        for (int i = 0; i < arr_size - 2; i++) 
        {
            k = i + 1; // first
            r = arr_size - 1; // last
            while (k < r) 
            {
                if (A[i] + A[k] + A[r] == sum) 
                {
                    System.out.println("Triplet is " + A[i] + " ," + A[k]
                            + " ," + A[r]);
                    return true;
                }
                else if (A[i] + A[k] + A[r] < sum)
                    k++;
                 
                else 
                    r--;
            }
            
        }
 
        // no found
        return false;
    }
    
    // Driver program
    public static void main(String[] args) 
    {
    	sumOfTriples triplet = new sumOfTriples();
        int A[] = {6,-4,4,-2,-3,-1,3,5};
        int sum = 0;
        int arr_size = A.length;
 
        triplet.findTripkes(A, arr_size, sum);
    }
}

//another version
/*
 sort(S);
 for i=0 to n-3 do
    a = S[i];
    start = i+1;
    end = n-1;
    while (start < end) do
       b = S[start]
       c = S[end];
       if (a+b+c == 0) then
          output a, b, c;
          // Continue search for all triplet combinations summing to zero.
           end = end - 1
       else if (a+b+c > 0) then
          end = end - 1;
       else
          start = start + 1;
       end
    end
 end
 */
