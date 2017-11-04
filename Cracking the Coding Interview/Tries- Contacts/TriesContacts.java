import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static class Node {   
        
        char value;
        List<Node> children = new ArrayList<>();
        
        Node() {}
        
        Node(char value) {
            this.value = value;
        }
        
        Node getChild(char value) {
            for (Node node: children) {
                if (node.value == value) {
                    return node;
                }
            }
            return null;
        }
        
        int countAllChildren()  {
            return countAllChildren(0);
        }
        
        int countAllChildren(int count) {
            for (Node node: children) {
                count += node.countAllChildren(0);
            }
            return value == '*' ? ++count : count;
        }
    }
    
    static class Tree {
        
        Node root = new Node();
        
        void add(String word) {
            Node current = root;
            for (char c: word.toCharArray()) {
                Node next = current.getChild(c);
                if (next == null) {
                    next = new Node(c);
                    current.children.add(next);
                } 
                current = next;
                //System.out.println("------ " + c + " ---------");
                //print(root);
            }
            if (current.getChild('*') == null) {
                current.children.add(new Node('*'));
            }
        }
        
        int count(String word) {
            char[] chars = word.toCharArray();
            Node current = root;
            int i = 0;
            while(current != null && i < chars.length) {
                current = current.getChild(chars[i++]);
            }
            //System.out.println("current: " + current + " ,i = " + i + " ,size = " + chars.length);
            if (current != null && i == chars.length) {
                return current.countAllChildren();
            }
            return 0;
        }
        
        void print(Node n) {
            for (Node node : n.children) {
                System.out.print(node.value + " ");
            }
            System.out.println();
            for (Node node : n.children) {
                print(node);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Tree tree = new Tree();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            if (op.equals("add")) {
                tree.add(contact);
            } else {
                System.out.println(tree.count(contact));
            }
        }
    }
}
