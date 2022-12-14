public class SumOfTwo {

    /*/
    14. Написать алгоритм SumOfTwo, который принимает на вход
    массив целых чисел, и число n. Алгоритм возвращает пары
    элементов, которые в сумме дают число n.
    ({4,3,7,12,5,2,9,4,12},12) →{{3,9},{7,5}}
     */

    public int[][] sumOfTwo(int[] a, int sum) {
        if(a.length > 0) {

            int[] b = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                b[i] = a[i];
            }
            int count = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    if(sum == (a[i] + a[j])) {
                        count++;
                        a[i] = -2147483648;
                        a[j] = -2147483648;
                    }
                }
            }
            int[][] result = new int[count][2];

            count = 0;
            for (int i = 0; i < b.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    if (sum == b[i] + b[j]) {
                        result[count][0] = b[i];
                        result[count][1] = b[j];
                        count++;
                        b[i] = -2147483648;
                        b[j] = -2147483648;
                    }
                }
            }
            return result;
        }
        return new int[][]{};
    }
}
