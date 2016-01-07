/* Head ends here */
import java.time.LocalDateTime;
import java.util.*;
public class Solution {

    static void insertionSort(int[] ar)
    {
        int shift = 0;
        for (int i = 1 ; i < ar.length ; i++)
        {
        	int element = ar[i];
            for (int j = i - 1 ; j >= 0 ; j--)
            {
                if (element < ar[j])
                {
                    ar[j + 1] = ar[j];
                    ar[j] = element;
                    shift++;
                }
            }


        }
        System.out.println(shift);
    }

/* Tail starts here */

 static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
      }

      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt();
           }
           System.out.println(LocalDateTime.now());
           insertionSort(ar);
           System.out.println(LocalDateTime.now());
       }
   }