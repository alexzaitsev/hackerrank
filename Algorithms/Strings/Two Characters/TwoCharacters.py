#!/bin/python3

import sys


s_len = int(input().strip())
s = input().strip()

chars = list(set(s))
count = 0
for i in range(len(chars)-1):
    for j in range(i+1, len(chars)):
        finalString = []
        for c in s:
            if c == chars[i] or c == chars[j]:
                finalString.append(c)
        lastChar = ''
        canBeResult = True
        for c in finalString:
            if lastChar == c:
                canBeResult = False
                break
            lastChar = c
        if canBeResult and len(finalString) > count:
            count = len(finalString)
            
print(count)
