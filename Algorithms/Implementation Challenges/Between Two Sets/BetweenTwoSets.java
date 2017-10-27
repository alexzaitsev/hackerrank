import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getTotalX(int[] a, int[] b) {
        int f = lcm(a);
        int l = gcd(b);
        int count = 0;
        for(int i = f, j = 2; i <= l; i = f*j, j++){
            if(l%i == 0) { 
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        System.out.println(getTotalX(a, b));
        in.close();
    }
    
    static int gcd(int a, int b) {
        while (b > 0) {
            int temp = b;
            b = a % b; 
            a = temp;
        }
        return a;
    }
    
    static int gcd(int[] input) {
        int result = input[0];
        for (int i = 1; i < input.length; i++) {
            result = gcd(result, input[i]);
        }
        return result;
    }
    
    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }

    static int lcm(int[] input) {
        int result = input[0];
        for (int i = 1; i < input.length; i++) {
            result = lcm(result, input[i]);
        }
        return result;
    }
}
