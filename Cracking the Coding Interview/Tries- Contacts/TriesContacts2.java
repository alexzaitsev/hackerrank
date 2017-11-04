import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static class Node {   
        
        private static int NUMB_OF_CHARS = 26;
        private Node[] children = new Node[NUMB_OF_CHARS];
        private int size = 0;
        
        private static int getCharIndex(char c) {
            return c - 'a';
        }
        
        public Node getNode(char c) {
            return children[getCharIndex(c)];
        }
        
        public void setNode(char c, Node node) {
            children[getCharIndex(c)] = node;
        }
        
        public void add(String s) {
            add(s, 0);
        }
        
        private void add(String s, int index) {
            size++;
            if (index == s.length()) return;
            char current = s.charAt(index);
            Node child = getNode(current);
            if (child == null) {
                child = new Node();
                setNode(current, child);
            }
            child.add(s, index + 1);
        }
        
        public int count(String s) {
            return count(s, 0);
        }
        
        private int count(String s, int index) {
            if (index == s.length()) return size;
            Node child = getNode(s.charAt(index));
            if (child == null) {
                return 0;
            }
            return child.count(s, index + 1);
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Node root = new Node();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            if (op.equals("add")) {
                root.add(contact);
            } else {
                System.out.println(root.count(contact));
            }
        }
    }
}
