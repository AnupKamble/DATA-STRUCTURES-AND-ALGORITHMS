import java.util.HashSet;

public class LongestReapetingSubstring {

    public static void main(String[] args) {
        
        String str = "abcabcbb";

        // System.out.println(str);

        HashSet <Character> set = new HashSet <>();
           
        int i=0;
        int j = 0;
        int n = str.length();
        int ans =0;
        
        while ( i < n && j < n) {

            if ( !set.contains(str.charAt(j))) {
                set.add(str.charAt(j++));

                ans = Math.max(ans, j - i);
            } else {
                set.remove(str.charAt(i++));
            }
    }

    System.out.println(ans);
  
    
}}
