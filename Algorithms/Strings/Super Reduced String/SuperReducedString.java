import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static boolean isReducible(String s) {
        for (int i=0; i<s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                return true;
            }
        }
        return false;
    }
    
    static String reduce(String s) {
        while(isReducible(s)) {
            for (int i=0, length=s.length(); i<length-1;) {
                if (s.charAt(i) == s.charAt(i+1)) {
                    s = s.substring(0, i) + s.substring(i+2, length);
                    length -= 2;
                } else {
                    i++;
                }
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = reduce(s);
        System.out.println(result.isEmpty() ? "Empty String" : result);
    }
}
