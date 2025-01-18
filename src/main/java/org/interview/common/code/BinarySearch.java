package org.interview.common.code;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while(left <= right) {
            int mid = (left+right) / 2;
            if(target == arr[mid]) {
                return mid;
            }
            if(target < arr[mid]) {
                right = mid-1;
            }else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        if (left <= right) {
            int mid = (left + right) / 2;
            if (target == arr[mid]) {
                return mid;
            }
            if (target < arr[mid]) {
                return binarySearchRecursive(arr, target, left, mid - 1);
            } else {
                return binarySearchRecursive(arr, target, mid + 1, right);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 11, 33, 34, 39, 64, 68, 90};
        int target = 33;
        int index = binarySearch(arr, target);
        if (index == -1) {
            System.out.println(target + " Not Found");
        } else {
            System.out.println("Target @ " + index);
        }

        int index2 = binarySearchRecursive(arr, target, 0, arr.length - 1);
        if (index2 == -1) {
            System.out.println(target + " Not Found");
        } else {
            System.out.println("Target @ " + index2);
        }
    }
}
