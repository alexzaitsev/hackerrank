// Memory-consuming solution, not all tests were passed

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int check(int[][] board, int size, int rQueen, int cQueen, int xStep, int yStep) {
        int count = 0;
        while(rQueen > 0 && rQueen < size && cQueen > 0 && cQueen < size && board[rQueen][cQueen] == 0) {
            rQueen += yStep;
            cQueen += xStep;
            count++;
        }
        return count;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int rQueen = in.nextInt();
        int cQueen = in.nextInt();
        int size = n + 1;
        int[][]board = new int[size][size];
        for(int i = 0; i < k; i++){
            int rObstacle = in.nextInt();
            int cObstacle = in.nextInt();
            board[rObstacle][cObstacle] = 1;
        }
        
        int count = 0;
        count += check(board, size, rQueen, cQueen + 1, 1, 0);
        count += check(board, size, rQueen, cQueen - 1, -1, 0);
        count += check(board, size, rQueen - 1, cQueen, 0, -1);
        count += check(board, size, rQueen + 1, cQueen, 0, 1);
        count += check(board, size, rQueen + 1, cQueen + 1, 1, 1);
        count += check(board, size, rQueen + 1, cQueen - 1, -1, 1);
        count += check(board, size, rQueen - 1, cQueen + 1, 1, -1);
        count += check(board, size, rQueen - 1, cQueen - 1, -1, -1);
        
        System.out.println(count);
    }
}

