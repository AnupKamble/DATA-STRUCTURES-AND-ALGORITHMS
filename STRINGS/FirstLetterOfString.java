import java.util.*;

public class FirstLetterOfString {
 public static void main(String[] args) {
    
    String str = "Hello! Guest WelCome to Home";

    char [] arr = str.toCharArray();

    // System.out.println(str);
    for ( int i=0; i<arr.length; i++ ) {

        // System.out.print(arr[i]+" ");

            if( arr[i] != ' ' && ( i==0 || arr[i-1] == ' ')) {
                 System.out.println(arr[i]);
            }
         
    }
 }    

}
