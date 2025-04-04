package again.again;

public class methods {
     int logic(int i, int q){
        int z;
        if (i>q){     // __________
                                //|
            z = i+q;            //|
            }                  // |
        else {                 // |----------------- Method syntax........ What I am doing here is I copy pasted the logic and it
                    //            |                     will return the value of z which we can assume as the third variable or c1
            z = (i+q)*2;       // |
        }                      // |
        return z;//_______________|
    }
    public static void main(String[] args) {
/*      int a = 9;       ....// For some reason I have to repeat this logic repeatedly
        int b = 7;     .... // Instead of repeating this logic I will put this in a method
        int c;
        if (a>b){
            c = a+b;
            }
        else {
            c = (a+b)*2;
        }
 */     methods obj = new methods(); // You can also make an object which we will learn in oops.... recalling it the syntax is same but
        int a1 = 9;                  // you have to add 'yourObjName.' before your method as done below...
        int b1 = 7;
        int c1;
        c1 = obj.logic(a1, b1); // what I did here is I recalled the method logic in c1..... so i will be a1, q will be b1 & z will be c1
        System.out.println(c1); // now the value of c1 should be.... 16.
    }
}
