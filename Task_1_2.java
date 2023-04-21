import java.util.Arrays;

public class Task_1_2 {
    public static void main(String[] args) {
        int[] sortArr = {17, 23, 123, 32, 45, 12, 86};
        int[] result = selectionSort(sortArr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] selectionSort(int[] sortArr) {
        for (int i = 0; i < sortArr.length; i++) {
            int pos = i;
            int min = sortArr[i];
            for (int j = i + 1; j < sortArr.length; j++) {
                if (sortArr[j] < min) {
                    pos = j;
                    min = sortArr[j];
                }
            }
            sortArr[pos] = sortArr[i];
            sortArr[i] = min;
        }
        return sortArr;
    }
}
