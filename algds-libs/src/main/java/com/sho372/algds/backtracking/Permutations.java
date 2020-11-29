package com.sho372.algds.backtracking;
import com.sho372.algds.string.StringManipulation;

import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class Permutations {

    private StringManipulation sm = new StringManipulation();
    private Set<String> res = new HashSet<>();

    //TODO: move to test
//    public static void main(String[] args) {
//        Permutations p = new Permutations();
//        System.out.println(p.permNoDuplicated("GOOGLE", 3));
//    }

    // nPk = k!*nCk -> permutation
    // nPn = n!*nCn = n! -> factorial
    /**
     *
     * @param str
     * @param k
     */
    public Set<String> permNoDuplicated(String str, int k) {
        permNoDuplicatedHelper(str, k, "");
        return res;
    }

    /**
     *
     * @param str
     * @param k
     * @param chosen
     */
    private void permNoDuplicatedHelper(String str, int k, String chosen) {

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
