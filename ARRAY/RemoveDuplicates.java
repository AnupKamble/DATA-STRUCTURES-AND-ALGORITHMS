
public class RemoveDuplicates {
    public static void main(String[] args) {
        
  
        int [] arr ={0,0,1,1,1,2,2,3,3,4};
           
        int j=0;
        for ( int i=1; i<arr.length; i++ ) {
          

            if ( arr[i] != arr[j] ) {
                 
                j++;

                arr[j] = arr[i] ;     
                System.out.println(arr[j]);         
            }       
        }
        }
    }

