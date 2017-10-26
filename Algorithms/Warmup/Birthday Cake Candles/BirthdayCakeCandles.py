#!/bin/python3

n = int(input().strip())
ar = list(map(int, input().strip().split(' ')))
print(ar.count(max(ar)))
