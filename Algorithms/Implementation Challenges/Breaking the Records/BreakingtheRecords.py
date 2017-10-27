#!/bin/python3

import sys


n = int(input().strip())
s = list(map(int, input().strip().split(' ')))
highest = s[0]
lowest = s[0]
highBreak = 0
lowBreak = 0
for i in range(1, n):
    if s[i] > highest:
        highest = s[i]
        highBreak += 1
    elif s[i] < lowest:
        lowest = s[i]
        lowBreak += 1
print (highBreak, lowBreak)
