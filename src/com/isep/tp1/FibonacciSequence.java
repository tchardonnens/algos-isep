package com.isep.tp1;
import java.util.*;

public class FibonacciSequence {

    int RecursiveFib(int n){
        if (n==0 || n==1) {
            return n;
        }
        int result = RecursiveFib(n-1) + RecursiveFib(n-2);
        return result;
    }

    void IterativeFib(int n){
        //  Time Complexity = 0(n) because n-1 iterations
        int f0=0,f1=1,f2=0;
        if(n==0||n==1){
            System.out.println(n);
        }
        else {
            System.out.println("F0: " + f0 + " F1: " + f1);
            for(int i=1;i<n;i++) {
                f2 = f1 + f0;
                f0 = f1;
                f1 = f2;
                System.out.println("F0: " + f0 + " F1: " + f1);
            }
            System.out.println("Iterative result: " + f1);
        }
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        FibonacciSequence obj= new FibonacciSequence();
        System.out.println("Recursive result: " + obj.RecursiveFib(n));
        obj.IterativeFib(n);
    }
};
