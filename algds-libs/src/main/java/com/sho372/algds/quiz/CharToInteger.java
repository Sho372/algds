package com.sho372.algds.quiz;

public class CharToInteger {

    public static void main(String[] args) {

        System.out.print('あ');

        /*
        Convert alphabets to int. (0 begins)
         */
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        char[] chars = alphabets.toCharArray();
        for (char c:chars) {
            System.out.print(c - 'a' + ",");
        }
        System.out.println();

        /*
        Convert numeric string to int. (0 begins)
         */
        String ints = "012345";
        char[] chars2 = ints.toCharArray();
        int sum = 0;
        for (char c:chars2) {
            int i =  c - '0';
            sum += i;
        }
        System.out.println(sum);
    }

}
