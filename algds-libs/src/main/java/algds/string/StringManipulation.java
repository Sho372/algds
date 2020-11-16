package algds.string;

public class StringManipulation {

    public String rmAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos+1);
    }

    public String insAt(String s, char c, int pos) {
        return s.substring(0, pos) + c + s.substring(pos);
    }
}
