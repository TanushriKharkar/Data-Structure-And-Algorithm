package _3_String;

public class _6_Permutation_String {

    public boolean isMatched(int map1[], int map2[])   {
        for(int i=0; i<26; i++) {
            if(map1[i] != map2[i])  {
                return false;
            }
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {

        int n = s1.length();
        int m = s2.length();

        if(m<n) {
            return false;
        }

        int map1[] = new int[26];   //0
        int map2[] = new int[26];

        for(int i=0; i<n; i++)  {
            map1[s1.charAt(i) - 'a']++;
            map2[s2.charAt(i) - 'a']++;
        }

        //intial window
        if(isMatched(map1, map2))   {
            return true;
        }

        for(int i=1; i<=m-n; i++)   {
            map2[s2.charAt(i-1) - 'a']--;   //delete
            map2[s2.charAt(i+n-1) - 'a']++; //add
            if(isMatched(map1, map2))   {
                return true;
            }
        }

        return false;
    }


    public static void main(String args[]){
        _6_Permutation_String obj = new _6_Permutation_String();

        // Sample Test Case 1
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println("Output 1: " + obj.checkInclusion(s1, s2));  // Expected: true ("ba" is in "eidbaooo")

        // Sample Test Case 2
        String s3 = "ab";
        String s4 = "eidboaoo";
        System.out.println("Output 1: " + obj.checkInclusion(s3, s4));
    }
}
