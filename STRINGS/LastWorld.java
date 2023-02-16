// Input: s = "Hello World"
// Output: 5
// Explanation: The last word is "World" with length 5.

// Input: s = "luffy is still joyboy"
// Output: 6
// Explanation: The last word is "joyboy" with length 6.


public class LastWorld {
    public static void main(String[] args) {
        
        String str = "luffy is still joyboy";


      String s = str.trim();

      int lastSpace = s.lastIndexOf(" ");

    //   System.out.println(lastSpace);
    System.out.println(str.length());

     int count = str.length() - lastSpace -1 ;  
    System.out.println(count);

    }
}
