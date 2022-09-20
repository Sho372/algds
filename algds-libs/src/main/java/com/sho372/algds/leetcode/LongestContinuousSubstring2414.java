package com.sho372.algds.leetcode;

public class LongestContinuousSubstring2414 {

        public int longestContinuousSubstring(String s) {

            char[] cs = s.toCharArray();
            int max = 1;
            int cnt = 1;

            for (int i = 0; i < cs.length-1; i++) {
               if(cs[i+1] - cs[i] == 1) {
                   cnt++;
               } else {
                   cnt = 1;
               }
               max = Math.max(max, cnt);
            }
            return max;

    }

































    public int longestContinuousSubstring2(String s) {

        char[] ca = s.toCharArray();
        int max = 1;
        int cnt = 1;

        for (int i = 1; i < ca.length; i++) {

           if(ca[i] - ca[i-1] == 1) {
               cnt++;
               max = Math.max(max, cnt);
           } else {
               cnt =1;
           }

        }
        return max;
    }

    public static void main(String[] args) {
        String s = "qruvijdyhztqqnpkfeqcssaintfdgztwxyszoyvbztubiqixljezwpfzoqfkgmbtoilsukxjhepooqnubypojwsosjqyagamiovyagtkrarsolwedowocxbxkydozzsabxbtqlxpbhrbehpkxlevosebrlalvnzpfymsvaykjtketncmhvzdiaysynoousrqowyfcmuouqgttsnwytgbqmphahmfotkbwrrytcgraitqvtwnavxhjobfuwxjywasohusqizqafxuwlqwabnifxlskjtikwscejtnmjkncssbjpjtwrpprbkaemgfxrkfbhssmhimjqsdlacioeijpccgfvijrtgrgnzijygrcamdheafiihgxreglcwinpfhvjfipzsyqenxogpwtwnybwtswvmotvnbdakwhxbpedkmludeuseadyfavokmgkflvyoebvnjxkxqedznoiqrsfmamztuyjyusacixufrmmmliikwlhsztrkbtctothzthpefmxkhtqwvsodfdbchyamuprmuxmjnhnbohhbrabgvflaboztaaswacowwywyabbcugwgfdfvnkckqhisyyasyiwtbwmowwejhrnzidhtzpanguqwksmwnjvjwnnvesmmzzfgktyudghitksvcomskenxxeapxxyumpfkndjtddwqsntegjgtjklpvcgtuwdipcfshonjiznunkpnkjqzvlfxovittmrxchscsapsbtxqqgvutubkgzajjuanbhrzfijjsovxnnmqdvxpjpnsbhmlhighiooujqtcbwtzqfvitvqcqdaujyokziogyzeaskdzcigiqafpzqlzgzjnlfhbftotsdthjkrbivfzcyqufwumgyrzicywhhdigmnflplmthlihtgegvmxrwfehkqynkltiqzzlguleymqxpbyauubjlxmecckgtbvpywtlttalfcihbaghjfyulmmercjdtjftjarajpwelsprokczhsodhycjshctcdqjmdhmmavroqenilrwdtszyekoacrcizbapksnakpfciewahyxtuyreourkgvcvmyvagrkuqzxdszcdenqsyrpatxtxokyytyjruazfndxmokntmossomouv";
        LongestContinuousSubstring2414 a = new LongestContinuousSubstring2414();
        System.out.println(a.longestContinuousSubstring2(s));

    }


}
