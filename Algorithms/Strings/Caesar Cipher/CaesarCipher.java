import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        if (k > 26) {
            k %= 26;
        }
        StringBuilder res = new StringBuilder();
        for (char c: s.toCharArray()) {
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    res.append(c + k > 'Z' ? (char) (c + k - 'Z' + 'A' - 1) : (char) (c + k));
                } else {
                    res.append(c + k > 'z' ? (char) (c + k - 'z' + 'a' - 1) : (char) (c + k));
                }
            } else {
                res.append(c);
            }
        }
        System.out.println(res);
        in.close();
    }
}
