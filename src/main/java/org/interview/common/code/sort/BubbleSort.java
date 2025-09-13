package org.interview.common.code.sort;

/**
 * Package: com.testing01
 * Author: Peter
 * ClassName: BubbleSort
 * Created Date: 2023/6/11
 */
public class BubbleSort {

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0 ; i < n-1 ;i++) {
            for(int j = 0 ; j < n-i-1 ; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 39, 10, 68, 33, 11, 2};
        System.out.print("原数组: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
        bubbleSort(arr);
        System.out.print("冒泡排序后: ");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
