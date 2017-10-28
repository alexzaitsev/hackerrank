#!/bin/python3

import sys


n = int(input().strip())
s = input().strip()
k = int(input().strip())

if (k > 26):
    k %= 26
    
res = []    
for c in s:
    if c.isalpha():
        if c.isupper():
            res.append(chr(ord(c) + k - ord('Z') + ord('A') - 1) if ord(c) + k > ord('Z') else chr(ord(c) + k))
        else:
            res.append(chr(ord(c) + k - ord('z') + ord('a') - 1) if ord(c) + k > ord('z') else chr(ord(c) + k))
    else:
        res.append(c)
        
print(''.join(res))
