# https://www.hackerrank.com/challenges/ctci-linked-list-cycle/problem

"""
Detect a cycle in a linked list. Note that the head pointer may be 'None' if the list is empty.

A Node is defined as: 
 
    class Node(object):
        def __init__(self, data = None, next_node = None):
            self.data = data
            self.next = next_node
"""


def has_cycle(head):
    fast = head
    while fast != None and head != None:
        if fast.next == None:
            return False
        fast = fast.next.next
        head = head.next
        if fast != None and head != None and fast == head:
            return True
    return False
