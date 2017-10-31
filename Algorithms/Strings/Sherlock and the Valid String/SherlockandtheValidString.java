// https://www.hackerrank.com/challenges/sherlock-and-valid-string/problem
// 2 tests were not passed (dunno why because it's identical to py solution)

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static boolean isValid(String s){
        Map<Integer, Integer> freq = new HashMap<>();
        for (char c: s.toCharArray()) {
            int key = (int) c;
            freq.put(key, freq.containsKey(key) ? freq.get(key) + 1 : 1);
        }
        List<Integer> values = new ArrayList<>(freq.values());
        Collections.sort(values);
       
        long firstValues = values.stream().filter(x -> x == values.get(0)).count();
        long lastValues = values.stream().filter(x -> x == values.get(values.size()-1)).count();
        return firstValues == values.size() || 
            firstValues == values.size() - 1 && values.get(values.size()-1) - values.get(values.size()-2) == 1 ||
            lastValues == values.size() - 1 && values.get(0) == 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(isValid(s) ? "YES" : "NO");
        in.close();
    }
}
