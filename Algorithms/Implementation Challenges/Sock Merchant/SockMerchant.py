#!/bin/python3

from collections import Counter

n = int(input().strip())
ar = list(map(int, input().strip().split(' ')))
print(sum([int(value / 2) for value in Counter(ar).values() if value / 2 >= 1]))
