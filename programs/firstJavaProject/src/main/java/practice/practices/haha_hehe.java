package practice.practices;

public class haha_hehe {
    public static void main(String[] args) {
        try{
            int a = 12;
            int b = 0;
            int c = a/b;
        }
        catch (ArithmeticException e){
            System.out.println("Haha");
        }
        try{
            int a = 12;
            int b = 0;
            int c = 57675/5656556;
        }
        catch (IllegalArgumentException e){
            System.out.println("hehe");
        }

    }
}
