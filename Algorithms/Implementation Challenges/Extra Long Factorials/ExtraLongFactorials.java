import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Solution {

    static BigInteger factorial(BigInteger n) {
        return n.equals(BigInteger.ONE) ? BigInteger.ONE : n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.println(factorial(BigInteger.valueOf(N)));
        in.close();
    }
}
