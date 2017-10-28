import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        
        Set<Character> charset = new HashSet<>();
        for (int i=0; i<s.length(); i++) {
            charset.add(s.charAt(i));
        }
        Character[] chars = charset.toArray(new Character[charset.size()]);
        
        int count = 0; 
        
        for (int i=0; i<chars.length-1; i++) {
            for (int j=i+1; j<chars.length; j++) {
                StringBuilder newstr = new StringBuilder();
                for (int c=0; c<s.length(); c++) {
                    if (s.charAt(c) == chars[i] || s.charAt(c) == chars[j]) {
                        newstr.append(s.charAt(c));
                    }
                }
                Character lastChar = newstr.charAt(0);
                boolean canBeResult = true;
                for (int z=1; z<newstr.length(); z++) {
                    if (newstr.charAt(z) == lastChar) {
                        canBeResult = false;
                        break;
                    }               
                    lastChar = newstr.charAt(z);
                }
                if (canBeResult && newstr.length() > count) {
                    count = newstr.length();
                }
            }
        }
        
        System.out.println(count);
        in.close();
    }
}

