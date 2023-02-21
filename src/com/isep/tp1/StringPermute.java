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
        StringPermute permutes = new StringPermute();
        System.out.println("Permutations: " + Permutations("ab"));
        ArrayList<String> results = new ArrayList<>();
        System.out.println("Permutations: " + PermutationsN("abcdef", "", results));
    }
}
