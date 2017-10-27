#!/bin/python3

import sys


s,t = map(int, input().strip().split(' '))
a,b = map(int, input().strip().split(' '))
m,n = map(int, input().strip().split(' '))
apples = map(int, input().strip().split(' '))
oranges = map(int, input().strip().split(' '))
print(sum([1 for apple in apples if a + apple >= s and a + apple <= t]))
print(sum([1 for orange in oranges if b + orange >= s and b + orange <= t]))
