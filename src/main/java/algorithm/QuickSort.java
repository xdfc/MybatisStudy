package algorithm;

import java.util.Arrays;
import java.util.Random;

/**
 * 演示使用原地快速排序对整数数组进行排序。
 */
public class QuickSort {

    private static final Random RANDOM = new Random();

    public static void sort(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivotIndex = partition(array, left, right);
        quickSort(array, left, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, right);
    }

    private static int partition(int[] array, int left, int right) {
        int pivotIndex = left + RANDOM.nextInt(right - left + 1);
        swap(array, pivotIndex, right);
        int pivot = array[right];
        int storeIndex = left;
        for (int i = left; i < right; i++) {
            if (array[i] <= pivot) {
                swap(array, storeIndex, i);
                storeIndex++;
            }
        }
        swap(array, storeIndex, right);
        return storeIndex;
    }

    private static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] numbers = {9, 4, 7, 3, 10, 5, 2, 8, 6, 1};
        System.out.println("原始数组: " + Arrays.toString(numbers));
        QuickSort.sort(numbers);
        System.out.println("排序结果: " + Arrays.toString(numbers));
    }
}
