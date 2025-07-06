package _1_Array;

import java.util.Arrays;

public class _9_SortArray_0_1_2 {

    public void swap(int[] arr, int pos1, int pos2)    {
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    public void sortColors(int[] nums) {
        //Time complexity => O(n)
        //space complexity => O(1)

        int start = 0;
        int mid = 0;
        int end = nums.length - 1;

        while(mid <= end)   {

            switch(nums[mid])   {

                case 0:
                    //swap with start index
                    swap(nums, start, mid) ;
                    start++;
                    mid++;
                    break;

                case 1:
                    //no swap
                    mid++;
                    break;

                case 2:
                    //swap with end index
                    swap(nums, mid, end);
                    end--;
                    break;
            }

        }
    }

    public static void main(String args[])  {
        _9_SortArray_0_1_2 obj = new _9_SortArray_0_1_2();

        //Sample Input
        int[] nums = {2, 0, 2, 1, 1, 0};

        System.out.println("Original array:");
        System.out.println(Arrays.toString(nums));

        //Sort the array
        obj.sortColors(nums);

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(nums));
    }
}
