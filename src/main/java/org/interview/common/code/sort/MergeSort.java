package org.interview.common.code.sort;

/**
 * Package: com.testing01
 * Author: Peter
 * ClassName: MergeSort
 * Created Date: 2023/6/11
 */
public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right) {
        if(left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int i = 0; i < n1 ; i++) {
            L[i] = arr[left + i];
        }
        for(int i = 0 ; i < n2 ; i++) {
            R[i] = arr[mid + i + 1];
        }
        int i = 0, j = 0;
        int k = left;
        while(i < n1 && j < n2){
            if(L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 39, 10, 68, 33, 11, 90};
        System.out.print("原数组: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        int n = arr.length;
        mergeSort(arr, 0, n - 1);
        System.out.print("归并排序后: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
