import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static int check(Map<Integer, List<Integer>> obstacles, int size, int rQueen, int cQueen, int xStep, int yStep) {
        int count = 0;
        while(rQueen > 0 && rQueen < size && cQueen > 0 && cQueen < size) {
            List<Integer> columns = obstacles.get(rQueen);
            if (columns != null && columns.contains(cQueen)) {
                break;
            }
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
        Map<Integer, List<Integer>> obstacles = new HashMap<>();
        for(int i = 0; i < k; i++){
            int rObstacle = in.nextInt();
            int cObstacle = in.nextInt();
            if (!obstacles.containsKey(rObstacle)) {
                List<Integer> columns = new ArrayList<>();
                columns.add(cObstacle);
                obstacles.put(rObstacle, columns);
            } else {
                obstacles.get(rObstacle).add(cObstacle);
            }
        }
        
        int count = 0;
        count += check(obstacles, size, rQueen, cQueen + 1, 1, 0);
        count += check(obstacles, size, rQueen, cQueen - 1, -1, 0);
        count += check(obstacles, size, rQueen - 1, cQueen, 0, -1);
        count += check(obstacles, size, rQueen + 1, cQueen, 0, 1);
        count += check(obstacles, size, rQueen + 1, cQueen + 1, 1, 1);
        count += check(obstacles, size, rQueen + 1, cQueen - 1, -1, 1);
        count += check(obstacles, size, rQueen - 1, cQueen + 1, 1, -1);
        count += check(obstacles, size, rQueen - 1, cQueen - 1, -1, -1);
        
        System.out.println(count);
    }
}
