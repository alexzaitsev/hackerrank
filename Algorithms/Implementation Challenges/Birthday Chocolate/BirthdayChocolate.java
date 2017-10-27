import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int[] s, int d, int m){
        if (n == 1) {
            return s[0] == d ? 1 : 0;
        }
        int count = 0, sum;
        for (int i=0, upto=n-m; i<=upto; i++) {
            sum = 0;
            for (int j=i, jupto=i+m; j<jupto; j++) {
                sum += s[j];
            }
            if (sum == d) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
        in.close();
    }
}
