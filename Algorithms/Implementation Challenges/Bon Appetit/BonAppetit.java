import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int sharedMealsCost = 0;
        for(int i = 0; i < n; i++){
            int nextMealCost = in.nextInt();
            if (i != k) {
                sharedMealsCost += nextMealCost;
            }
        }
        int b = in.nextInt();
        int shouldBeCharged = sharedMealsCost / 2;
        System.out.println(b == shouldBeCharged ? "Bon Appetit" : b - shouldBeCharged);
    }
}
