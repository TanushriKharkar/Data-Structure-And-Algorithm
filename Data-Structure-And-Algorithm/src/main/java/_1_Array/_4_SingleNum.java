package _1_Array;

public class _4_SingleNum {

    public int singleNumber(int[] nums) {

        //time complexity = O(n)
        //space complexity = O(1)

        int idx = 0;
        for(int i=0; i<nums.length; i++)    {
            idx = idx ^ nums[i];
        }

        return idx;
    }

    public static void main(String args[])  {
        _4_SingleNum obj = new _4_SingleNum();

        // Sample Input: every number appears twice except 7
        int[] nums = {2, 3, 5, 4, 5, 3, 2, 4, 7};

        // Output
        System.out.println("The single number is: " + obj.singleNumber(nums)); // 7
    }
}
