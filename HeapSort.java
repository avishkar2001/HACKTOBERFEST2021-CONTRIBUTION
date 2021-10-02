package com.company;

import java.util.Arrays;


public class HeapSort {

    private static int N;


    public static void sort(int arr[]) {


        heapify(arr);

        for (int i = N; i > 0; i--) {

            swap(arr, 0, i);
            N = N - 1;

            maxheap(arr, 0);
        }
    }


    public static void heapify(int arr[]) {
        N = arr.length - 1;

        for (int i = N / 2; i >= 0; i--)
            maxheap(arr, i);
    }


    public static void maxheap(int arr[], int i) {



        int leftchild = 2 * i;
        int rightchild = 2 * i + 1;
        int max = i;


        if (leftchild <= N && arr[leftchild] > arr[i])
            max = leftchild;

        if (rightchild <= N && arr[rightchild] > arr[max])
            max = rightchild;


        if (max != i) {
            swap(arr, i, max);
            maxheap(arr, max);
        }
    }


    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {4, 1, 3, 2, 14, 9, 11, 13, 6, 5};
        sort(array);
        System.out.println("Heap Sort using heapify method is as follows: " + Arrays.toString(array));
    }
}



