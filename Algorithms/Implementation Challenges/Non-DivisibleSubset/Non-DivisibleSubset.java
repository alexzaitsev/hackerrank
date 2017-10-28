import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] counts = new int[k];
   
        for (int i=0; i<n; i++) {
            counts[in.nextInt()%k]++;
        }
        
        int count = Math.min(counts[0], 1);
        for (int i=1; i<k/2+1; i++) {
            if (i != k-i) {
                count += Math.max(counts[i], counts[k-i]);
            }
        }
        
        if (k%2 == 0) {
            count++;
        }
        
        System.out.println(count);
        in.close();
    }
}
