import java.util.Arrays;

public class PeakElement {

//    public static void main(String[] args) {
//
//        System.out.println(Arrays.toString(peakElement(new int[]{3, 2, 7, 5, 1, 9, 23, 1})));
//    }

    public int[] peakElement(int[] num){

        if(num.length == 0) {
            return new int[0];
        }

        int[] array2 = new int[num.length];
        int counter = 0;
        if (num[0]> num[1]) {
            array2[counter] = num[0];
            counter ++;
        }
        for (int i = 1; i < num.length; i++) {

            if(num[i]  > num[i-1] && (num[i] > num[i+1])) {
                array2[counter] = num[i];
                counter ++;

            }
        }
        return Arrays.copyOf(array2,counter);
    }



}

