/**
 * Test if string s is the circular rotation of string t.
 */

public class Test{
    public static void main(String[] args) {
        //test
        String s = "ACTGACG";
        String t = "TGACGAC";
        System.out.println(isCircularRatation(s, t));
        
    }
    public static boolean isCircularRatation(String s, String t){
        if(s.length() != t.length()) return false;
        String temp = t + t;
        if (temp.indexOf(s) != -1) return true;
        else return false;
    }
}