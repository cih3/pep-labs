import java.util.Arrays;

import com.azul.crs.client.Result;

public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        //int a1 = arr1.length;
        //int a2 = arr2.length;
        int[] result = new int[arr1.length + arr2.length];
        int c=0;
        for( int i = 0; i<arr1.length;i++){
            result[i]= arr1[i];
            c++;
        }
        for( int j = 0; j < arr2.length;j++){
            result[c++]= arr2[j];
        }
        for( int i = 0; i < result.length; i++){
            //System.out.println(result[i]+ " ");;
        }

        return result;
    }
}
