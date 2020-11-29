package com.sho372.algds.backtracking;

import com.sho372.algds.string.StringManipulation;

import java.util.Set;
import java.util.TreeSet;

public class Permutations {

    public static void main(String[] args) {
        Set<String> comb = permNoDuplicated("GOOGLE", 3);
        for (String ch :comb) {
            System.out.println(ch);
        }
    }

    static StringManipulation sm = new StringManipulation();
    static Set<String> res = new TreeSet<>();

    // nPk = k!*nCk -> permutation
    // nPn = n!*nCn = n! -> factorial
    static Set<String> permNoDuplicated(String str, int k) {
        permNoDuplicatedHelper(str, k, "");
        return res;
    }

    static void permNoDuplicatedHelper(String str, int k, String chosen) {

        if(chosen.length() == k) {
            // Use a set as a filter
            res.add(chosen);
        } else {
            int len = str.length();
            for (int i = 0; i < len; i++) {
                String ch = sm.strAt(str, i);
                if(!chosen.contains(ch)) {

                    // Choose
                    chosen += ch;
                    str = sm.rmAt(str, i);

                    // Explore
                    permNoDuplicatedHelper(str, k, chosen);

                    // BackTrack
                    str = sm.insAt(str, ch, i);
                    chosen = chosen.substring(0, chosen.length()-1);
                }
            }
        }
    }
}
