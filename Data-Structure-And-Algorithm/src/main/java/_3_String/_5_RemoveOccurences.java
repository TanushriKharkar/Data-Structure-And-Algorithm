package _3_String;

// Remove All Occurrences of a Substring
public class _5_RemoveOccurences {


    public String removeOccurrences(String s, String part) {
        //time complexity = O(n*m)  => n-iterations, m-part of substring to remove

        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int m = part.length();

        for(int i=0; i<n; i++)  {
            // adding the characters
            sb.append(s.charAt(i));

            //StringBuilder length must be greater than or equal to part length
            if(sb.length() >= m)    {
                //if part occur then remove it
                String sub = sb.substring(sb.length() - m);
                if(sub.equals(part))    {
                    sb.setLength(sb.length() - m);
                }
            }
        }
        return sb.toString();
    }


    public static void main(String args[])  {
        _5_RemoveOccurences obj = new _5_RemoveOccurences();

        // Sample inputs
        String s1 = "daabcbaabcbc";
        String part1 = "abc";
        System.out.println("Output 1: " + obj.removeOccurrences(s1, part1)); // Expected: "dab"

        String s2 = "axxxxyyyyb";
        String part2 = "xy";
        System.out.println("Output 2: " + obj.removeOccurrences(s2, part2)); // Expected: "axxxxyyyyb" (no change)
    }
}
