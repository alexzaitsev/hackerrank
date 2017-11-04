# https://www.hackerrank.com/challenges/ctci-is-binary-search-tree/problem

import sys

""" Node is defined as
class node:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None
"""

def check(root, minvalue, maxvalue):
    if root == None:
        return True
    if root.data <= minvalue or root.data >= maxvalue:
        return False
    return check(root.left, minvalue, root.data) and check(root.right, root.data, maxvalue)

def checkBST(root):
    return check(root, -sys.maxsize - 1, sys.maxsize)
