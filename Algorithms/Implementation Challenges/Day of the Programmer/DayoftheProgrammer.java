import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static boolean isLeapJulian(int year) {
        return year % 4 == 0;
    }
    
    static boolean isLeapGregorian(int year) {
        return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        int feb = year < 1918 && isLeapJulian(year) || year > 1918 && isLeapGregorian(year) ? 29 : year == 1918 ? 15 : 28;
        System.out.printf("%d.09.%d", 256 - 215 /* num of days in 7 months */ - feb, year);
        in.close();
    }
}
