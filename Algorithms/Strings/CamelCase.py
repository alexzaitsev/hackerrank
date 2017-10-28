#!/bin/python3

import sys

s = input().strip()
print(sum(1 for c in s if c.isupper()) + 1)
