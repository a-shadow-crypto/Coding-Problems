import java.util.Scanner;

public class GradingSystem {
    
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int grade = scn.nextInt();

        if(grade>90) {
            System.out.println("excellent");
        } else if(grade>80 && grade<=90) {
            System.out.println("good");
        } else if(grade>70 && grade<=80) {
            System.out.println("fair");
        } else if(grade>60 && grade<=70) {
            System.out.println("meets expectations");
        } else {
            System.out.println("below par");
        }
    }
}
