package com.isep.tp1;
import java.util.ArrayList;
import java.util.Scanner;

public class StringPermute {
    public static ArrayList<String> Permutations(String uniqueCharStr) {

        ArrayList<String> permutations = new ArrayList<>();
        for (int i=0; i<uniqueCharStr.length(); i++){
            for (int j=0; j<uniqueCharStr.length(); j++){
                if (i==j){
                    continue;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(uniqueCharStr.charAt(i));
                sb.append(uniqueCharStr.charAt(j));
                permutations.add(sb.toString());
            }
        }
        return permutations;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str =sc.nextLine();
        StringPermute permutes = new StringPermute();
        System.out.println("Permutations: " + permutes.Permutations(str));
    }
}
