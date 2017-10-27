import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0; i < n; i++){
            int grade = in.nextInt();
            if (grade < 38) {
                System.out.println(grade);
            } else {
                int next5 = (((int) grade/5) + 1) * 5;
                System.out.println(next5 - grade < 3 ? next5 : grade);
            }
        }
    }
}
