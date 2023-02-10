import javafx.scene.input.MouseButton;

public class CharComparison {
    /**
     * Given an array of char, determine if the array A belongs to the left or to the right of char array B lexigraphically.
     * That means its position in a dictionary, eg:
     * cat < dog < mouse
     * cat < car < care
     * You will need to compare an index of both arrays against each other as you iterate with a for loop.
     *
     * @param a an array of char.
     * @param b an array of char.
     * @return -1 if A is less than B, 1 if A is greater than B, and 0 if the two arrays are identical.
     */
    public int compare(char[] a, char[] b){
      int i=0;
        for (;i < a.length &&  i< b.length; i++) {
            if (a [i] < b[i]){
                return -1;
            }else if(a[i] > b[i]){
                return 1;
            }else if (a[i]== b[i]){
                
            }
            }
        return 0;
    }
   
}
