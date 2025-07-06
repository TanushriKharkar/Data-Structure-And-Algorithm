package _3_String;

public class _4_ReverseWords_String {

    public String reverseWords(String s) {
        //time complexity => O(n)
        //space complexity => O(1)

        s = s.trim(); // remove leading/trailing spaces
        StringBuilder ans = new StringBuilder();

        int n = s.length();
        int i = n - 1;

        while (i >= 0) {
            // Skip trailing spaces between words
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            int j = i;

            // Find the beginning of the word
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            // Append word to result
            if (j >= 0) {
                ans.append(s.substring(i + 1, j + 1));
                ans.append(" ");
            }
        }

        return ans.toString().trim(); // remove the last extra space
    }


    public static void main(String args[])  {
        _4_ReverseWords_String obj = new _4_ReverseWords_String();

        // Sample inputs
        String input1 = "  the sky   is blue  ";
        String input2 = "hello world";
        String input3 = "a good   example";

        // Outputs
        System.out.println("Input: \"" + input1 + "\"");
        System.out.println("Reversed: \"" + obj.reverseWords(input1) + "\"\n");

        System.out.println("Input: \"" + input2 + "\"");
        System.out.println("Reversed: \"" + obj.reverseWords(input2) + "\"\n");

        System.out.println("Input: \"" + input3 + "\"");
        System.out.println("Reversed: \"" + obj.reverseWords(input3) + "\"");
    }
}
