package advancedpracticesets;
import java.util.Scanner;

public class o2_practice_questions {

    static void multiplication_table(int n){
          for (int i = 0;i<=10; i++){
              System.out.printf("%d X %d = %d \n",n,i, n*i);
          }
    }
    static void pattern(int n){
        for (int i = 0; i<n; i++){
            for (int j = 0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Two very simple questions for yall
        // Ist question, write a java method to print the multiplication table of n....... and take the number n from the user......
        // IInd question, write a program using functions to print the following pattern - ****, ***, **, * in seperate lines








        //Ist question
        Scanner sc = new Scanner(System.in);
        System.out.println("Fill in the number whoose multiplication table you need to see");
        int n = sc.nextInt();
        System.out.println("THe multiplication table for " + n+ "is ");
        multiplication_table(n);



//        IInd question
        System.out.println("Fill in the number whoose stars table you need to see");
        int b = sc.nextInt();
        pattern(b);
    }
}
