
import java.util.*;
import java.util.HashMap;

public class Hashmap {
     public static void main(String [] args ) {
           
        String str = "abcabcbb";
        int n = str.length();


        HashMap <Character,Integer> hm1 = new HashMap<>();

        for (int i=0; i<n; i++ ) {

            if ( hm1.containsKey(str.charAt(i))) {

                int count = hm1.get(str.charAt(i));
                 count++;
                hm1.put(str.charAt(i),count);
            }

            else {

                hm1.put(str.charAt(i),1);
            }
        }

        // System.out.println(hm1);
         
        for(Map.Entry <Character,Integer> val:hm1.entrySet() ){


            System.out.println(val.getKey() +"-" + val.getValue());
        }
    
     }
}
