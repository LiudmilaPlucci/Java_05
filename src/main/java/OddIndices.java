import java.lang.reflect.Array;
import java.util.Arrays;

public class OddIndices {

    public String oddIndices(int[] array) {
//        int[] array = new int[]{2, 3, 5, 9, 11, 8, 15, 18, -61, 91};
        int[] a = new int[array.length / 2];
        int counter = 0;

        for (int i = 1; i < array.length; i++) {
            if (i % 2 != 0) {
                a[counter] = array[i];
                counter++;
            }
        }

        return Arrays.toString(a);
    }
}


