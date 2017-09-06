import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double negative = 0;
        double zero = 0;
        double positive = 0;
        for (int i=0; i<n; i++) {
            int next = scan.nextInt();
            if (next < 0) {
                negative++;
            } else if (next == 0) {
                zero++;
            } else {
                positive++;
            }
        }
        System.out.printf("%.6f %n", positive / n);
        System.out.printf("%.6f %n", negative / n);    
        System.out.printf("%.6f %n", zero / n);        
    }
}