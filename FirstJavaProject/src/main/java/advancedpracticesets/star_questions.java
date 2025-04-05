package advancedpracticesets;
import java.util.Scanner;

public class star_questions {
    static int stars(int n){
        for (int i = n; i >= 0; i--){
            for (int j = i; j >= 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number so that you can see its star pattern going off till 1");
        int b = sc.nextInt();
        int c;
        System.out.println("These are the star patterns for " + b + ":");
        c = stars(b);
    }
}
