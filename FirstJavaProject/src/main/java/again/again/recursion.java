package again.again;

public class recursion {
    static int factorial1(int n){
        if (n==0 || n == 1){
            return 1;
        }
        else{
            return n * factorial1(n-1);
        }
    }
    public static void main(String[] args) {
        int b = 5;
        int a;
        a = factorial1(b);
        System.out.println(a);
    }
//    there is one question for you all..... print the 8 nubers of the fibonacci series.... i will give the solution in solution file
}
