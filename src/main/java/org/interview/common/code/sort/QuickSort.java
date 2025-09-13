package org.interview.common.code.sort;

/**
 * Package: com.testing01
 * Author: Peter
 * ClassName: QuickSort
 * Created Date: 2023/6/11
 */
public class QuickSort {
    public static void quickSort(int[] arr, int low, int high){
        if(low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low;
        for(int j = low ; j < high ; j++) {
            if(arr[j] < pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 39, 10, 68, 33, 11, 2};
        System.out.print("原数组: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
        int n = arr.length;
        quickSort(arr, 0, n-1);
        System.out.print("快排后: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
