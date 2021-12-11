import java.util.*;

public class RemovePrimes {
    
    public static boolean prime(int c) {
        for(int i=2; i*i<c;i++) {
            if(c%i == 0) {
                return false;
            }
        }
        return true;
    }

	public static void solution(ArrayList<Integer> al){
		// write your code here
		for(int i=al.size()-1; i>=0;i--) {
		    int res = al.get(i);
		    if(prime(res) == true) {
		        al.remove(i);
		    }
		}
        		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}
