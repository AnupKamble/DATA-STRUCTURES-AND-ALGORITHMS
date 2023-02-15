import java.util.HashSet;

public class LongestReapetingSubstring {

    public static void main(String[] args) {
        
        String str = "abcabcbb";

        // System.out.println(str);

        HashSet <Character> set = new HashSet <>();

        for ( int i=0; i<str.length(); i++ ) {

            if ( !set.contains(str.charAt(i))) {
                set.add(str.charAt(i));

            }
    }

    System.out.println(set);
  
    
}}
