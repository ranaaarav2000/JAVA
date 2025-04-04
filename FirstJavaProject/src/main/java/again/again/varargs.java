package again.again;

public class varargs {
//    static int sum(int a, int b){ // A simple method to sum up num
//        return a+b;
//    }
//    static int sum(int a, int b, int c){ // A simple method to sum up methods but with 3 parameters.... some who did study well will notice that this is an overloaded method
//        return a+b+c;
//    }
//    to avoid overloading methods repeatedly we can use varargs.... below me is a vararg which converts all the parameters given in an array, so it is super useful
      static int sum(int ...arr){
          int res = 0;
          for (int a:arr){
              res += a;
          }
          return res;
      }
//    to avoid overloading methods repeatedly we can use varargs.... below me is a vararg which converts all the parameters given in an array, so it is super useful

    public static void main(String[] args) {
        System.out.println("Welcome to varargs tut");
//        // With 2 parameters
//        System.out.println("The sum of 60 & 65 is: " +sum(60,65));
//        // With 2 parameters
//
//       // with 3 parameters
//        System.out.println("The sum of 60 & 60 & 60" + sum(60,60,60));
//       // with 3 parameters
        System.out.println("The sum of the numbers 1,2,3,4,5,6,7,8,9,10 are " + sum(1,2,3,4,5,6,7,8,9,10));

    }
}
