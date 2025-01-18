package org.interview.common.code.sort;

public class Sorting {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        // swap pivot
        int temp = arr[high];
        arr[high] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] LEFT = new int[n1];
        int[] RIGHT = new int[n2];
        for (int i = 0; i < n1; i++) {
            LEFT[i] = arr[left + i];
        }
        for (int i = 0; i < n2; i++) {
            RIGHT[i] = arr[mid + i + 1];
        }
        int k = left;
        int i = 0, j = 0;
        while (i < n1 && j < n2) {
            if (LEFT[i] <= RIGHT[j]) {
                arr[k] = LEFT[i];
                i++;
            } else {
                arr[k] = RIGHT[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = LEFT[i];
            k++;
            i++;
        }
        while (j < n2) {
            arr[k] = RIGHT[j];
            k++;
            j++;
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            // System.out.println("left: " + left + " mid: " + mid + " right: " + right + ",
            // arr[mid]: " + arr[mid]);
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // bubble sort
        int[] arr1 = new int[] { 5, 2, 4, 6, 9, 13, 10, 7, 8, 1, 3, 20, 15 };
        System.out.print("Before Bubble Sort: ");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        bubbleSort(arr1);
        System.out.print("After Bubble Sort: ");
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        System.out.println();
        // quick sort
        int[] arr2 = new int[] { 5, 2, 4, 6, 9, 13, 10, 7, 8, 1, 3, 20, 15 };
        System.out.print("Before Quick Sort: ");
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println();
        quickSort(arr2, 0, arr2.length - 1);
        System.out.print("After Quick Sort: ");
        for (int i : arr2) {
            System.out.print(i + " ");
        }
        System.out.println();
        // merge sort
        int[] arr3 = new int[] { 5, 2, 4, 6, 9, 13, 10, 7, 8, 1, 3, 20, 15 };
        System.out.print("Before Merge Sort: ");
        for (int i : arr3) {
            System.out.print(i + " ");
        }
        System.out.println();
        mergeSort(arr3, 0, arr3.length - 1);
        System.out.print("After Merge Sort: ");
        for (int i : arr3) {
            System.out.print(i + " ");
        }
        System.out.println();
        // binary search with target
        int target = 13;
        int index = binarySearch(arr3, target);
        System.out.print("Binary Search: ");
        if (index == -1) {
            System.out.println("Not Found " + target);
        } else {
            System.out.println("Found " + target + " at index " + index);
        }
        target = 16;
        index = binarySearch(arr3, target);
        System.out.print("Binary Search: ");
        if (index == -1) {
            System.out.println("Not Found " + target);
        } else {
            System.out.println("Found " + target + " at index " + index);
        }
    }
}
