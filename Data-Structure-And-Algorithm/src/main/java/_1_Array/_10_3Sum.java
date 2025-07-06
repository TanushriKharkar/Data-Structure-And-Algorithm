package _1_Array;
import java.util.*;

public class _10_3Sum {
    public List<List<Integer>> threeSum(int[] arr) {
        //time complexity => O(n^2)
        //space complexity => O(n)

        //for empty array
        if(arr == null || arr.length < 3)   {
            return new ArrayList<>();
        }

        //sort the elements
        Arrays.sort(arr);
        Set<List<Integer>> result = new HashSet<>();

        //now fix the first element and finf the other two elements
        for(int i=0; i< arr.length-2; i++)  {

            //find other two elements using two sum approach
            int left = i+1;
            int right = arr.length-1;

            while(left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                if(sum == 0)    {

                    //add the set and move to find other triplets
                    result.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    right--;
                }
                else if(sum < 0)    {
                    left++;
                }
                else    {
                    right--;
                }
            }

        }
        return new ArrayList<>(result);

    }

    public static void main(String args[])  {
        _10_3Sum obj = new _10_3Sum();

        // Sample Input
        int[] nums = {-1, 0, 1, 2, -1, -4};

        //Call the method
        List<List<Integer>> triplets = obj.threeSum(nums);

        // Print the result
        System.out.println("Triplets with sum 0:");
        for (List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }
    }
}
