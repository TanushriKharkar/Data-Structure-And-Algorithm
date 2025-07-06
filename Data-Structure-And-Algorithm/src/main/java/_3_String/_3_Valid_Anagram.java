package _3_String;

public class _3_Valid_Anagram {
    public boolean isAnagram(String s, String t) {
        //time complexity => O(n)
        //space complexity => O(1)

        //using bucket array

        //convert both to lowercase to ignore case match
        s = s.toLowerCase();
        t = t.toLowerCase();

        //strip of all the white spaces
        s = s.replace(" ", "");
        t = t.replace(" ", "");

        //initialize the bucket array
        int[] counts = new int[26];

        //fill the bucket
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
        }

        //empty the bucket
        for (int i = 0; i < t.length(); i++) {
            counts[t.charAt(i) - 'a']--;
        }

        //check if all buckets are empty
        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String args[])  {
        _3_Valid_Anagram obj = new _3_Valid_Anagram();

        // Sample Inputs
        String s1 = "Listen";
        String t1 = "Silent";

        String s2 = "Hello";
        String t2 = "Olelh";

        String s3 = "Test";
        String t3 = "Taste";

        // Output
        System.out.println("\"" + s1 + "\" & \"" + t1 + "\" → " + obj.isAnagram(s1, t1)); // true
        System.out.println("\"" + s2 + "\" & \"" + t2 + "\" → " + obj.isAnagram(s2, t2)); // true
        System.out.println("\"" + s3 + "\" & \"" + t3 + "\" → " + obj.isAnagram(s3, t3)); // false
    }
}
