package _3_String;
import java.util.*;

public class _2_LongestCommon_Prefix {
    public String longestCommonPrefix(String[] strs) {

        //time complexity => O(n logn)     ( bcoz of sorting)
        //space complexity => O(1)
        StringBuilder result = new StringBuilder();

        //sort the array
        Arrays.sort(strs);

        //get first and last string
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();

        //start comparing
        for (int i = 0; i < first.length; i++) {
            if (first[i] != last[i]) {
                break;
            }
            result.append(first[i]);
        }
        return result.toString();
    }

    public static void main(String args[])  {
        _2_LongestCommon_Prefix obj = new _2_LongestCommon_Prefix();

        // Sample Test Inputs
        String[] input1 = {"flower", "flow", "flight"};
        String[] input2 = {"dog", "racecar", "car"};
        String[] input3 = {"interspecies", "interstellar", "interstate"};

        // Test and Print Outputs
        System.out.println("Common prefix of input1: " + obj.longestCommonPrefix(input1)); // "fl"
        System.out.println("Common prefix of input2: " + obj.longestCommonPrefix(input2)); // ""
        System.out.println("Common prefix of input3: " + obj.longestCommonPrefix(input3)); // "inters"

    }
}
