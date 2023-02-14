package com.isep;

public class RecursionExample {

    public static void main(String[] args) {
        RecursionExample re = new RecursionExample();
        int result = re.factorial(4);
        System.out.println("Result: " + result);
    }
    public int factorial(int n){
        if (n==0){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
}
