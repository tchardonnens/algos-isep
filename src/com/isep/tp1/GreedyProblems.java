package com.isep.tp1;
import java.util.Scanner;

// Question 1: This is an optimization problem because this problem
// involves finding a maximum revenue ("maximize revenue")

public class GreedyProblems {

    int MaxSeqProduct(int n, int[] clicks, int[] prices) {
        int prod = 0;
        quickSort(clicks, 0, n-1);
        quickSort(prices, 0, n-1);
        for (int i = 0; i < n; i++) {
            prod += clicks[i]*prices[i];
        }
        return prod;
    }

    void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivot = partition(arr, left, right);
            quickSort(arr, left, pivot - 1);
            quickSort(arr, pivot + 1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;
        return i + 1;
    }

    public static void main(String args[]) {
        int n = 0;
        GreedyProblems obj = new GreedyProblems();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n");
        n = sc.nextInt();
        System.out.println("Enter the clicks");
        int[] clicks = new int[n];
        for (int i = 0; i < n; i++) {
            clicks[i] = sc.nextInt();
        }
        System.out.println("Enter the prices");
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        System.out.println("MAX profit available = " + obj.MaxSeqProduct(n, clicks, prices));
    }
}
