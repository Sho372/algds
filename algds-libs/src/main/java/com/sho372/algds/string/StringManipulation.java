package com.sho372.algds.string;

/**
 *
 */
public class StringManipulation {

    /**
     *
     * @param s
     * @param pos
     * @return
     */
    public String rmAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos+1);
    }

    /**
     *
     * @param s
     * @param c
     * @param pos
     * @return
     */
    public String insAt(String s, char c, int pos) {
        return s.substring(0, pos) + c + s.substring(pos);
    }

    /**
     *
     * @param s
     * @param c
     * @param pos
     * @return
     */
    public String insAt(String s, String c, int pos) {
        return s.substring(0, pos) + c + s.substring(pos);
    }

    /**
     *
     * @param s
     * @param pos
     * @return
     */
    public String strAt(String s, int pos) { return s.substring(pos, pos+1); }
}
