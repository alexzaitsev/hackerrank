import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> input = new ArrayList<>();
        int n = 5;
        for(int i=0; i<n; i++){
            input.add(in.nextInt());
        }
        in.close();
        
        Collections.sort(input);
        long min = 0, max = 0;
        for(int i=0; i<n; i++){
            if (i != n-1) {
                min += input.get(i);
            }
            if (i != 0) {
                max += input.get(i);    
            }
        }
        
        System.out.printf("%d %d", min, max);
    }
}
