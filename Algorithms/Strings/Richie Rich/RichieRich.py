#!/bin/python3

# https://www.hackerrank.com/challenges/richie-rich/problem

import sys

def richieRich(s, n, k):
    left = list(map(int, list(s[:len(s)//2])))
    right = list(map(int, list(s[len(s)//2:] if len(s) % 2 == 0 else s[len(s)//2+1:])))
    right.reverse()
    countOfDiffs = sum(1 for i in range(len(left)) if left[i] != right[i])
    
    if countOfDiffs > k:
        return -1
    
    for i in range(len(left)):
        if left[i] == right[i] and left[i] != 9 and k - 2 >= countOfDiffs:
            left[i] = right[i] = 9
            k -= 2
        elif left[i] != right[i]:
            if left[i] == 9 or right[i] == 9 and k - 1 >= countOfDiffs - 1:
                left[i] = right[i] = 9
                k -= 1
                countOfDiffs -= 1
            elif k - 2 >= countOfDiffs - 1:
                left[i] = right[i] = 9
                k -= 2
                countOfDiffs -= 1
            elif k - 1 >= countOfDiffs - 1:
                left[i] = right[i] = max(left[i], right[i])
                k -= 1
                countOfDiffs -= 1
    
    middle = []
    if len(s) % 2 == 1:
        middle.append(9 if k > 0 else s[len(s)//2])
    right.reverse()
    return ''.join(map(str, left)) + ''.join(map(str, middle)) + ''.join(map(str, right))

n, k = map(int, input().strip().split())
s = input().strip()
print(richieRich(s, n, k))
