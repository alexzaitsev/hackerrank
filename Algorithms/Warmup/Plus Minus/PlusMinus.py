#!/bin/python3

import sys


n = int(input().strip())
arr = [int(arr_temp) for arr_temp in input().strip().split(' ')]

print("{0:.6f}".format(len([x for x in arr if x > 0]) / n))
print("{0:.6f}".format(len([x for x in arr if x < 0]) / n))
print("{0:.6f}".format(len([x for x in arr if x == 0]) / n))