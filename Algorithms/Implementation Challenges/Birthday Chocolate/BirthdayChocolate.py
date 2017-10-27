#!/bin/python3

import sys

n = int(input().strip())
s = list(map(int, input().strip().split(' ')))
d, m = map(int, input().strip().split(' '))
print(sum([1 for i in range(n-m+1) if sum(s[i:i+m]) == d]))
