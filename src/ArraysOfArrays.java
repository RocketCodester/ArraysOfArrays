
import java.util.Arrays;

//---------------------------------------------------------------
//         Project
//         ArraysOfArrays.java
//         Creates an array of arrays.
//---------------------------------------------------------------

public class ArraysOfArrays {
    
    public static void main(String[] args) {
        int arrays[][] = new int [5][];  
        int arr0[] = {1,2,3,4,5};
        int arr1[] = {10,20,30,40,50};
        arrays[0] = arr0;
        arrays[1] = arr1;
        System.out.println(Arrays.toString(arrays[0]));
        System.out.println(arrays[0][1]);
        System.out.println(Arrays.toString(arrays[1]));
        System.out.println(arrays[1][4]);
    }
    
}
