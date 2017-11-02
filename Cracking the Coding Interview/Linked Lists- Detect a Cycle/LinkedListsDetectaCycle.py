"""
Detect a cycle in a linked list. Note that the head pointer may be 'None' if the list is empty.

A Node is defined as: 
 
    class Node(object):
        def __init__(self, data = None, next_node = None):
            self.data = data
            self.next = next_node
"""


def has_cycle(head):
    if head == None:
        return 0
    
    traversed = [0]*100;
    counter = 1
    nextOne = head.next
    
    while True:
        if nextOne == None:
            return 0
        if nextOne is head:
            return 1 - min(1, sum(traversed))
        traversed[counter] += 1
        counter += 1
        nextOne = nextOne.next

