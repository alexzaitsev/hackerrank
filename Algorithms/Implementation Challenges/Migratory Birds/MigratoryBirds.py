#!/bin/python3

import sys

input()
types = [0]*6
for t in map(int, input().strip().split()):
    types[t] += 1
print(types.index(max(types)))
