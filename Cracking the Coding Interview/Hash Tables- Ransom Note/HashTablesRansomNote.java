// https://www.hackerrank.com/challenges/ctci-ransom-note/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        Map<String, Integer> magazineCounter = new HashMap<>();
        for(int i=0; i < m; i++){
            String word = in.next();
            magazineCounter.put(word, magazineCounter.containsKey(word) ? magazineCounter.get(word) + 1 : 1);
        }
        Map<String, Integer> ransomCounter = new HashMap<>();
        for(int i=0; i < n; i++){
            String word = in.next();
            ransomCounter.put(word, ransomCounter.containsKey(word) ? ransomCounter.get(word) + 1 : 1);
        }
        boolean yes = true;
        for (String word: ransomCounter.keySet()) {
            if (magazineCounter.get(word) < ransomCounter.get(word)) {
                yes = false;
                break;
            }
        }
        System.out.println(yes ? "Yes" : "No");
    }
}
