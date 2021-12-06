import java.util.*;

public class BinarySearch {
    public static int binarySearch(int [] arr, int x) {

        int li = 0;
        int ri = arr.length-1;
        
        while(li<=ri) {
            int mid = (li+ri)/2;
            if(arr[mid]==x) {
                return mid;
            } else if(arr[mid]>x) {
                // left me search karna hai
                ri = mid-1;
            } else {
                // look for the element in the right
                li = mid+1;
            }
        }
        return -1;
    }


    public static void main(String [] arg) {
        
        int [] arr = {4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24};
        // int x  = 20;
        //int x = 24;
        // int x = 11;
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();

        int result = binarySearch(arr, x);
        if(result == -1){
            System.out.println("Not Found!");
        } else {
            System.out.println(result);
        }
    }
}
