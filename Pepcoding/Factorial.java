import java.util.*;

public class Factorial {

    public static void main(String[] args) throws Exception {
        // write your code here
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(factorial(n));
        
    }

    public static int factorial(int n){
        if(n==0) {
            return 1;
        }
        return n*(n-1);
    }

}
