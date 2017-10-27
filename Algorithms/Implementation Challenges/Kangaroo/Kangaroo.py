#!/bin/python3

import sys

def kangaroo(x1, v1, x2, v2):
    if (x1 > x2 and v1 > v2) or (x1 < x2 and v1 < v2):
        return 'NO'
    elif (x1 != x2 and v1 == v2) or (x1 == x2 and v1 != v2):
        return 'NO'
    return 'YES' if (x2 - x1) % (v1 - v2) == 0 else 'NO'
            
x1, v1, x2, v2 = map(int, input().strip().split(' '))
print(kangaroo(x1, v1, x2, v2))
