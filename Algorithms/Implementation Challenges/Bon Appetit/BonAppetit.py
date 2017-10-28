#!/bin/python3

import sys

n, k = map(int, input().strip().split(' '))
ar = list(map(int, input().strip().split(' ')))
b = int(input().strip())
rest = b - (sum(ar) - ar[k]) / 2;
print('Bon Appetit' if rest == 0 else int(rest))
