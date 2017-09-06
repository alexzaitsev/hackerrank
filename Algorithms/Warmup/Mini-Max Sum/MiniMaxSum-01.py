#!/bin/python3

import sys

arr = list(map(int, input().strip().split(' ')))
arr.sort()
print(sum(arr[:4]), sum(arr[1:]))