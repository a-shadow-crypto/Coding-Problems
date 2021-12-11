import java.util.*;

public class Subset{
    
    public static void subSet(int arr[]) {
        // calculate total number of subset 
        int n = arr.length;
        int total = (int) Math.pow(2, n);
        
        // total number of subset print 
            // convert the decimal value to binary
        for(int i=0; i<total; i++) {
            // convert i=0 ---> 0 0 0
            int temp = i;
            String str = "";
            for(int j=n-1; j>=0; j--) {
                int r = temp % 2;
                temp = temp/2;
                
                if(r==0) {
                    str = "-\t" + str;
                } else {
                    str = arr[j] + "\t" + str;
                }
            }
            System.out.println(str);
        }
    }
    
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scn.nextInt();
        }
   
        subSet(arr);
    }
}
