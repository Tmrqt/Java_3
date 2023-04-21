import java.util.Arrays;

public class Task_1_1 {
    public static void main(String[] args) {
        int[] sortArr = {17, 23, 123, 32, 45, 12, 86};
        int[] result = mergeSort(sortArr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] mergeSortInner(int[] buffer_1, int[] buffer_2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer_1;
        }
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted_1 = mergeSortInner(buffer_1, buffer_2, startIndex, middle);
        int[] sorted_2 = mergeSortInner(buffer_1, buffer_2, middle, endIndex);

        int index_1 = startIndex;
        int index_2 = middle;
        int NewIndex = startIndex;
        int[] result = sorted_1 == buffer_1 ? buffer_2 : buffer_1;
        while (index_1 < middle && index_2 < endIndex) {
            result[NewIndex++] = sorted_1[index_1] < sorted_2[index_2]
                    ? sorted_1[index_1++] : sorted_2[index_2++];
        }
        while (index_1 < middle) {
            result[NewIndex++] = sorted_1[index_1++];
        }
        while (index_2 < endIndex) {
            result[NewIndex++] = sorted_2[index_2++];
        }
        return result;
    }

    public static int[] mergeSort(int[] sortArr) {
        int[] buffer_1 = Arrays.copyOf(sortArr, sortArr.length);
        int[] buffer_2 = new int[sortArr.length];
        int[] mergeSort = mergeSortInner(buffer_1, buffer_2, 0, sortArr.length);
        return mergeSort;
    }
}