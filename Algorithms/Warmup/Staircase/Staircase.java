import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();
        
        for (int i=0; i<n; i++) {
            for (int j=0; j<n-i-1; j++) {
                System.out.print(" ");    
            }
            for (int j=0; j<i+1; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}