package com.isep.tp1;
import java.util.ArrayList;

public class StringPermute {
    public static ArrayList<String> Permutations(String uniqueCharStr) {

        ArrayList<String> permutations = new ArrayList<>();
        for (int i=0; i<uniqueCharStr.length(); i++){
            for (int j=0; j<uniqueCharStr.length(); j++){
                if (i==j){
                    continue;
                }
                permutations.add(uniqueCharStr.charAt(i)+""+uniqueCharStr.charAt(j));
            }
        }
        return permutations;
    }

    // Question 3: There are as much nested loops as chars in the input string.
    // Therefore, for 3 chars, we have to add one more loop compared to the previous solution
    public static ArrayList<String> Permutations3(String uniqueCharStr) {

        ArrayList<String> permutations = new ArrayList<>();
        for (int i=0; i<uniqueCharStr.length(); i++){
            for (int j=0; j<uniqueCharStr.length(); j++){
                for (int k = 0; k < uniqueCharStr.length(); k++) {
                    if (i==j || i==k || j==k){
                        continue;
                    }
                    permutations.add(uniqueCharStr.charAt(i) + "" + uniqueCharStr.charAt(j) + "" + uniqueCharStr.charAt(k));
                }
            }
        }
        return permutations;
    }

    // Question 4: Permutations for general case (any length of input string)
    public static ArrayList<String> PermutationsN(String str, String build, ArrayList<String> results) {

        if (str.length() == 0) {
            results.add(build);
            return results;
        }

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String rest = str.substring(0, i) + str.substring(i + 1);
            PermutationsN(rest, build + c, results);
        }
        return results;
    }

    public static void main(String args[]){
        System.out.println("Permutations, 2 chars: " + Permutations("ab"));
        System.out.println("Permutations, 3 chars: " + Permutations3("abc"));
        ArrayList<String> results = new ArrayList<>();
        System.out.println("Permutations, general case: " + PermutationsN("abcdef", "", results));
    }
}
