import java.util.Arrays;

public class Intersection {
//        public static void main(String[] args) {
//
//        System.out.println(Arrays.toString(findIntersection(new int[]{1, 2, 4, 5, 89},new int[]{8, 9, 4, 2})));
//    }


    public  int[] findIntersection(int[] array1, int[] array2) {

//        array1 = new int[]{1, 2, 4, 5, 89};
//        array2 = new int[]{8, 9, 4, 2};
//        array3 = new int[] {2,4};

        int[] array3 = new int[array1.length * array2.length];
        int counter = 0;

        for (int i = 0; i < array1.length; i++) {

            for (int j = 0; j < array2.length; j++) {

                if (array1[i] == array2[j]) {
                    array3[counter] = array1[i];
                    counter ++;
                }
            }
        }
        return Arrays.copyOf(array3,counter);
    }
















}















