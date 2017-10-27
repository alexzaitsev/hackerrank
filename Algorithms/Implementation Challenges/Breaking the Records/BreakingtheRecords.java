import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int highest = 0, lowest = 0;
        int highBreak = 0, lowBreak = 0;
        for(int i=0; i < n; i++){
            int record = in.nextInt();
            if (i == 0) {
                highest = record;
                lowest = record;
            } else {
                if (record > highest) {
                    highest = record;
                    highBreak++;
                } else if (record < lowest) {
                    lowest = record;
                    lowBreak++;
                }
            }
        }
        System.out.printf("%d %d", highBreak, lowBreak);
    }
}
