#!/bin/python3

import sys


n = int(input().strip())
for i in range(0, n):
    print(' ' * (n - i - 1) + '#' * (i + 1))