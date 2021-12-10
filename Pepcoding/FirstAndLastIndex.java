import java.util.*;

public class FirstAndLastIndex{
    
    public static int firstIndex(int arr[], int x) {
        int li = 0;
        int ri = arr.length-1;
        int fi = -1;
        while(li<=ri) {
            int mid = (li+ri)/2;
            
            if(arr[mid]==x) {
                fi = mid;
                ri = mid-1;
            }else if(arr[mid]>x) {
                
                ri = mid-1;
            } else {
                
                li = mid+1;
            }
        }
        
        return fi;
    }
    
    public static int lastIndex(int arr[], int x) {
        int li = 0;
        int ri = arr.length-1;
        int lidx = -1;
        while (li<=ri) {
            int mid = (li+ri) /2;
            
            if(arr[mid]==x) {
                lidx = mid;
                li = mid + 1;
            } else if(arr[mid]>x) {
                ri = mid-1;
            } else {
                li = mid+1;
            }
        }
        return lidx;
    }
    
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];    
        for(int i=0; i<n; i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        
        int fi = firstIndex(arr, x);
        int li = lastIndex(arr, x);
        System.out.println(fi);
        System.out.println(li);
    }   
}
