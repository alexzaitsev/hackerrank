#!/bin/python3

import sys

n = int(input().strip())
for i in range(n):
    grade = int(input().strip())
    if grade < 38:
        print(grade)
    else:
        next5 = (int(grade/5) + 1) * 5;
        print(next5 if next5 - grade < 3 else grade)
   
