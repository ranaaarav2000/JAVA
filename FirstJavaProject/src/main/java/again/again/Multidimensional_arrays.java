package again.again;

public class Multidimensional_arrays {
    public static void main(String[] args) {
// Now we are going to study Multidimensional array
        // Multidimensional is array of arrays
        // Heres an example of Multidimensional 2D array
        int [][] flats;
        flats = new int [2][3]; //A 2d array with 2 rows and 3 columns

//      1st floor of an apartment for an example
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
//      1st floor of an apartment for an example

// 2nd floor of an apartment for an example
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
// 2nd floor of an apartment for an example

        int [][] flats2 = new int [2][3];
        flats2[0][0] = 101;
        flats2[0][1] = 102;
        flats2[0][2] = 103;
        flats2[1][0] = 201;
        flats2[1][1] = 202;
        flats2[1][2] = 203;
        for (int i = 0; i<flats2.length; i++){
            for (int j = 0; j<flats2[i].length; j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
      }
}
