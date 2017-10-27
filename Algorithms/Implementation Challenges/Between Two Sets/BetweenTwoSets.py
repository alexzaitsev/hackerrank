#!/bin/python3

import sys
from functools import reduce

def gcd(a: int, b: int) -> int:
    while a > 0 and b > 0:
        if a >= b:
            a = a % b
        else:
            b = b % a
    return a + b

def lcm(a: int, b: int) -> int:
    return a * b / gcd(a, b)

def gcd_list(a: list) -> int:
    return reduce(gcd, a)

def lcm_list(a: list) -> int:
    return reduce(lcm, a)

def getTotalX(a, b):
    l = lcm_list(a)
    g = gcd_list(b)
    count = 0
    multiple_of_lcm = l
    while multiple_of_lcm <= g:
        if g % multiple_of_lcm == 0:
            count += 1
        multiple_of_lcm += l
    return count
        
n, m = map(int, input().strip().split(' '))
a = list(map(int, input().strip().split(' ')))
b = list(map(int, input().strip().split(' ')))
print(getTotalX(a, b))
