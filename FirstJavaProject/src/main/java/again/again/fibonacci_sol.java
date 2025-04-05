package again.again;
import java.util.Scanner;

public class fibonacci_sol {
    static int fibbonacci(int n){
        if (n == 1){
            return 0;
        }
        else if (n == 2){
            return 1;
        }
        else {
            return fibbonacci(n-1) + fibbonacci(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("which number of fibonnaci series would you like to see ?");
        int b = sc.nextInt();
        int c = fibbonacci(b);
        System.out.println(c);
    }
}
