public class MinMaxAve {

    public int[] minMaxAve(int[] array, int indexStart, int indexEnd) {
//        int[] array = new int[]{1,2,3,4,5,6,7,8};

        int sum = 0;
        int max = array[indexStart];

//        if (indexStart <= indexEnd) {
            for (int i = indexStart; i < indexEnd + 1; i++) {
                if (max < array[i]) {
                    max = array[i];
                }
                sum += array[i];
            }
            int average = sum / (indexEnd - indexStart + 1);

            int min = array[indexStart];

            for (int i = indexStart; i < indexEnd + 1; i++) {
                if (min > array[i]) {
                    min = array[i];
                }
            }
            int[] array1 = {min, max, average};
            return (array1);
        }
}
