package com.sho372.algds.backtracking;
import com.sho372.algds.string.StringManipulation;

import java.util.HashSet;
import java.util.Set;

public class Subsets {

    //TODO move to test
//    public static void main(String[] args) {
//        Subsets s = new Subsets();
//        System.out.println(s.subsetStr("ABC"));
//    }

    private StringManipulation sm = new StringManipulation();
    private Set<Set<String>> res = new HashSet<>();

    /**
     * https://web.stanford.edu/class/archive/cs/cs106x/cs106x.1192/lectures/Lecture10/Lecture10.pdf
     * @param str
     */
    public Set<Set<String>> subsetStr(String str) {
        HashSet<String> chosen = new HashSet<>();
        subsetStrHelper(str, chosen);
        return res;
    }

    private void subsetStrHelper(String str, HashSet<String> chosen) {
        if(str.length() == 0) {
             HashSet<String> hs = new HashSet<>(chosen);
            res.add(hs);
        } else {
            int len = str.length();
            for (int i = 0; i < len; i++) {
                // Chose
                String ch = sm.strAt(str, i);
                str = sm.rmAt(str, i);

                // Without
                subsetStrHelper(str, chosen);

                // With
                chosen.add(ch);
                subsetStrHelper(str, chosen);

                // Backtrack
                str = sm.insAt(str, ch, i);
                chosen.remove(ch);
            }
        }
    }
}
