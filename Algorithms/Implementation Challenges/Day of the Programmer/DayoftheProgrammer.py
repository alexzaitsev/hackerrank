#!/bin/python3

import sys

def isLeapJulian(year):
    return year % 4 == 0

def isLeapGregorian(year):
    return year % 400 == 0 or (year % 4 == 0 and year % 100 != 0)

def solve(year):
    goal = 256
    months = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31]
    
    if (year < 1918 and isLeapJulian(year)) or (year > 1918 and isLeapGregorian(year)):
        months[1] = 29
    if year == 1918:
        months[1] -= 13
    month = 0
    for i in range(len(months)):
        if goal - months[i] > 0:            
            goal -= months[i]
        else:
            month = i + 1
            break
    
    return ('0' + str(goal) if goal < 10 else str(goal)) + '.' + ('0' + str(month) if month < 10 else str(month)) + '.' + str(year)

year = int(input().strip())
print(solve(year))
