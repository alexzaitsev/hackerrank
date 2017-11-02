import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static boolean isBalanced(String expression) {
        LinkedList<Character> brackets = new LinkedList<>();
        for (char c: expression.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                brackets.push(c);
            } else if (brackets.isEmpty()) {
                return false;
            } else {
                char pop = brackets.pop();
                if (c == ')' && pop != '(' || c == ']' && pop != '[' || c == '}' && pop != '{') {
                    return false;
                }
            }
        }
        return brackets.isEmpty();
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println((isBalanced(expression)) ? "YES" : "NO");
        }
    }
}
