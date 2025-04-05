package advancedpracticesets;
import java.util.Scanner;

public class very_imp_ques_for_you_all {
    static int sum(int n){
        if (n == 1){
            return 1;
        }
        else {
            return n + sum(n-1);
        }
    }
    public static void main(String[] args) {
        // We have to find the sum of first n numbers.... get the n number from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first n number you want to get the sum of till 1" );
        int b = sc.nextInt();
        int c = sum(b);
        System.out.println(c);
    }
}
