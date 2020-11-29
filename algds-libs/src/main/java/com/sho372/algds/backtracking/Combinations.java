package com.sho372.algds.backtracking;

import com.sho372.algds.string.StringManipulation;
import org.checkerframework.checker.units.qual.C;

import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class Combinations {

    private Set<Set<String>> res = new HashSet<>();
    private StringManipulation sm = new StringManipulation();

    //TODO move to test
//    public static void main(String[] args) {
//        Combinations c = new Combinations();
//        System.out.println(c.combStr("ABC", 2));
//    }

    /**
     * nCk
     * @param str
     * @param k
     */
    public Set<Set<String>> combStr(String str, int k) {
        HashSet<String> chosen = new HashSet<>();
        combStrHelper(str, k, chosen);
        return res;
    }

    /**
     *
     * @param str
     * @param k
     * @param chosen
     */
    private void combStrHelper(String str, int k, HashSet<String> chosen) {

        if(chosen.size() == k) {
            // It's a little tricky. Need to deep copy.
            HashSet<String> hs = new HashSet<>(chosen);
            res.add(hs);
        } else {
            int len = str.length();
            for (int i = 0; i < len; i++) {
                String ch = sm.strAt(str, i);
                chosen.add(ch);
                str = sm.rmAt(str, i);

                combStrHelper(str, k, chosen);

                chosen.remove(ch);
                str = sm.insAt(str, ch, i);
            }
        }
    }
}
