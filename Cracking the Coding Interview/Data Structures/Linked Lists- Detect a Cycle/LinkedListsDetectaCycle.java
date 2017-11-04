// https://www.hackerrank.com/challenges/ctci-linked-list-cycle/problem

/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    Node fast = head;
    while (head != null && fast != null && fast.next != null) {
        fast = fast.next.next;
        head = head.next;
        if (fast != null && head != null && fast.equals(head)) {
            return true;
        }
    }
    return false;
}
