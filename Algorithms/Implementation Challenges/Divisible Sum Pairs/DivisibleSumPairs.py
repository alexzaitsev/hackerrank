#!/bin/python3

import sys

def divisibleSumPairs(n, k, ar):
    count = 0
    for i in range(n-1):
        for j in range(i+1, n):
            if (ar[i] + ar[j]) % k == 0:
                count += 1
    return count

n, k = map(int, input().strip().split(' '))
ar = list(map(int, input().strip().split(' ')))
print(divisibleSumPairs(n, k, ar))
