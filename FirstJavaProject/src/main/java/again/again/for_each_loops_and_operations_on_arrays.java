package again.again;

public class for_each_loops_and_operations_on_arrays {
    public static void main(String[] args) {
// 1.  The length method to find out a length of an array
        // You can also create an array of floats
        float [] marks = {99,88,100,76,100};
        System.out.println(marks.length);
        // You can also create an array of floats

// 2. The way in which you ca display your arrays without any need of system.out.println
        // You can also create an array of a String
        String [] hello = {"Emil, Erik, James, Christopher, William"};
        // You can also create an array of a String

        //using a for loop to display elements of array
        for (int i = 0; i < hello.length; i++){
            System.out.println(hello[i]);
        }
        //using a for loop to display elements of array

// 3. This way is for lazy people like me to display elements of an array using for each loop.
        int [] marks2 = {100,90,10,58,93};
        for (int element : marks2){
            System.out.println(element);
        }


// quick quiz : Write a Java program to print the elements of any array in reverse order....... solution is below...... no cheating









































          int [] marks3 = {100,34,99,77,96};
        for (int i = marks3.length -1; i >= marks3.length; i--){
            System.out.println(marks3[i]);
        }




    }
}
