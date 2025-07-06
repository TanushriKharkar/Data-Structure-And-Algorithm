package _3_String;

public class _1_Valid_Palindrome {

    public boolean isAlphaNum(char ch)  {
        if((ch >= '0' && ch <= '9') ||
                (Character.toLowerCase(ch) >= 'a' && Character.toLowerCase(ch) <= 'z'))    {
            return true;
        }
        return false;
    }
    public boolean isPalindrome(String s) {
        //time complexity => O(n)
        //space complexity => O(1)

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (!isAlphaNum(s.charAt(left))) {
                left++;
                continue;
            }
            if (!isAlphaNum(s.charAt(right))) {
                right--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }


    public static void main(String args[])  {
        _1_Valid_Palindrome obj = new _1_Valid_Palindrome();

        // ✅ Sample Inputs
        String input1 = "A man, a plan, a canal: Panama";
        String input2 = "race a car";
        String input3 = "0P";

        // Output Results
        System.out.println("\"" + input1 + "\" → " + obj.isPalindrome(input1)); // true
        System.out.println("\"" + input2 + "\" → " + obj.isPalindrome(input2)); // false
        System.out.println("\"" + input3 + "\" → " + obj.isPalindrome(input3)); // false

    }
}
