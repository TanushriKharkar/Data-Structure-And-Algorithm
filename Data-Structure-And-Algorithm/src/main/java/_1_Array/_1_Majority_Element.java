package _1_Array;

public class _1_Majority_Element {

    public int majorityElement (int[] nums){

        int majority = nums[0];
        int votes = 1;

        for (int i = 1; i < nums.length; i++) {

            if (votes == 0) {
                votes++;
                majority = nums[i];
            } else if (majority == nums[i]) {
                votes++;
            } else {
                votes--;
            }
        }
        return majority;
    }

    public static void main(String args[]) {
        _1_Majority_Element obj = new _1_Majority_Element();

        // Sample input array
        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        // Call the method and print the result
        int result = obj.majorityElement(nums);
        System.out.println("Majority Element: " + result);
    }
}
