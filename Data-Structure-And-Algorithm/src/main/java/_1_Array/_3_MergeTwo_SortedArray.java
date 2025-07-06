package _1_Array;

public class _3_MergeTwo_SortedArray {

    public void merge(int[] A, int m, int[] B, int n) {
        //space complexity => O(1)
        //time complexity => O(m+n)
        int idx = m+n-1,  i = m-1,  j = n-1;

        while(i >= 0 && j >= 0)     {

            if(A[i] >= B[j])    {
                A[idx--] = A[i--];
            }
            else    {
                A[idx--] = B[j--];
            }
        }

        while(j >= 0)   {
            A[idx--] = B[j--];
        }
    }


    public static void main(String args[])  {
        _3_MergeTwo_SortedArray obj = new _3_MergeTwo_SortedArray();

        int[] A = new int[6]; // size m + n
        A[0] = 1;
        A[1] = 3;
        A[2] = 5;
        int m = 3;

        int[] B = {2, 4, 6};
        int n = 3;

        obj.merge(A, m, B, n);

        // Print merged array
        for (int num : A) {
            System.out.print(num + " ");
        }
    }
}
