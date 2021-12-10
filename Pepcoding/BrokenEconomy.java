import java.util.*;

public class BrokenEconomy {
    
    public static void brokenEconomy(int arr[], int d) {

        int ri = arr.length-1;
        int li = 0;
        int ceil = 0;
        int floor = 0;

        while(li<=ri) {
            int mid = (li + ri)/2;
            if(arr[mid]==d) {
                ceil = arr[mid];
                floor = arr[mid];
                break;
            } else if(arr[mid]<d) {
                floor = arr[mid];
                li = mid+1;
            } else {
                ceil = arr[mid];
                ri = mid-1;
            }
        }
        System.out.println(ceil);
        System.out.println(floor);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //int arr[] = {1, 5, 10, 15, 22, 33, 40, 42, 55, 66, 34};
        
        int n = scn.nextInt();
        int [] arr = new int [n];
        for(int i=0; i<n; i++) {
            arr[i] = scn.nextInt();
        }

        int d = scn.nextInt();

        brokenEconomy(arr, d);
    }
}
