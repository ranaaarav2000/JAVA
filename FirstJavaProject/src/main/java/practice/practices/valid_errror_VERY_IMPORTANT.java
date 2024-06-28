package practice.practices;

import java.util.Scanner;

public class valid_errror_VERY_IMPORTANT {
    public static void main(String[] args) {
        boolean flag = true;
        int [] rndmNmbrs = {100, 213,134};
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        while (flag && i<5){
            try{
                System.out.println("Enter the value of the index");
                index = sc.nextInt();
                System.out.println("The value of rndm nmbrs[index]is "+rndmNmbrs[index]);
                break;

            }
            catch (Exception e){
                System.out.println("Invalid index");
                i++;
            }
        }
        if (i>=5){
            System.out.println("Error");
        }
    }
}
