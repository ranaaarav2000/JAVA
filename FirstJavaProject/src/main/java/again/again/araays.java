package again.again;

public class araays {
    public static void main(String[] args) {
        // Class of 500 students - you have to store marks of these 500 students
    /* You have 2 options:
    1. create 500 variables
    2. use arrays (recommended)
     */
    /* In this case I am explaining using 5 student's marks
      but, obviously you can even use arrays with 100 student's marks.
      Now basically array is collection of similar types of data which can come in handy if you are
      dealing with a lot of similar data.
     */
        int [] marks = new int[5]; // This is an array
        marks[0] = 100; //This is how to store a value in your array. Make sure that you are only pitting the same value as mentioned in the type of your array.
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 90;
        marks[4] = 86;
        System.out.println(marks[4]);// Printing my array
    }
}
