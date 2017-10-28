#!/bin/python3

import sys

def reduce(s):
    res = []
    for c in s:
        if res and res[len(res) - 1] == c:
            res.pop()
        else:
            res.append(c)
            
    res = ''.join(res)
    return res or 'Empty String'

s = input().strip()
print(reduce(s))
