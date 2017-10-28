import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i++){
            ar[i] = in.nextInt();
        }
        Arrays.sort(ar);
        int count = 0;
        for (int i=0; i<n-1; i++) {
            if (ar[i] == ar[i+1]) {
                count++;
                i++;
            }
        }
        System.out.println(count);
        in.close();
    }
}
