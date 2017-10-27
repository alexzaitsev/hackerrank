import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int appleSum = 0, orangeSum = 0;
        for(int i=0; i < m; i++){
            int apple = in.nextInt();
            if (a + apple >= s && a + apple <= t) {
                appleSum++;
            }
        }
        for(int i=0; i < n; i++){
            int orange = in.nextInt();
            if (b + orange >= s && b + orange <= t) {
                orangeSum++;
            }
        }
        System.out.printf("%d\n%d", appleSum, orangeSum);
    }
}
