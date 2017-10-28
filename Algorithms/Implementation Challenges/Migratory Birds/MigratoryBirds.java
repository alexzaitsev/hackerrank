import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[] {0, 0, 0, 0, 0};
        for(int i = 0; i < n; i++){
            int type = in.nextInt();
            types[type - 1]++;
        }
        int maxType = 0;
        int maxCount = types[0];
        for(int i = 1; i < 5; i++) {
            if (types[i] > maxCount) {
                maxCount = types[i];
                maxType = i;
            }
        }
        System.out.println(maxType + 1);
    }
}
