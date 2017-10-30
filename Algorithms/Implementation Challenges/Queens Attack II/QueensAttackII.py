#!/bin/python3

import sys

def isLeft(rQueen, cQueen, r, c):
    return r == rQueen and c < cQueen

def isUp(rQueen, cQueen, r, c):
    return c == cQueen and r > rQueen

def isRight(rQueen, cQueen, r, c):
    return r == rQueen and c > cQueen

def isDown(rQueen, cQueen, r, c):
    return c == cQueen and r < rQueen

def isLeftTop(rQueen, cQueen, r, c):
    return c + r == rQueen + cQueen and c < cQueen

def isTopRight(n, rQueen, cQueen, r, c):
    return n - c + r == n - cQueen + rQueen and c > cQueen

def isRightBottom(rQueen, cQueen, r, c):
    return c + r == rQueen + cQueen and c > cQueen

def isBottomLeft(n, rQueen, cQueen, r, c):
    return n - c + r == n - cQueen + rQueen;

###

def calculateLeftTop(n, rQueen, cQueen):
    return calculateLeftTopWithObstacle(n, rQueen, cQueen, n + 1)
    
def calculateTopRight(n, rQueen, cQueen):
    return calculateTopRightWithObstacle(n, rQueen, cQueen, n + 1)

def calculateRightBottom(n, rQueen, cQueen):
    return calculateRightBottomWithObstacle(n, rQueen, cQueen, 0)

def calculateBottomLeft(n, rQueen, cQueen):
    return calculateBottomLeftWithObstacle(n, rQueen, cQueen, 0)

###

def calculateLeftTopWithObstacle(n, rQueen, cQueen, rObstacle):
    # row for i: rQueen + cQueen - i 
    return sum([1 for i in range(cQueen-1, 0, -1) if (rQueen + cQueen - i) < rObstacle])
    
def calculateTopRightWithObstacle(n, rQueen, cQueen, rObstacle):
    # row for i: rQueen + i - cQueen
    return sum([1 for i in range(cQueen+1, n+1) if (rQueen + i - cQueen) < rObstacle])

def calculateRightBottomWithObstacle(n, rQueen, cQueen, rObstacle):
    # row for i: rQueen + cQueen - i 
    return sum([1 for i in range(cQueen+1, n+1) if (rQueen + cQueen - i) > rObstacle])

def calculateBottomLeftWithObstacle(n, rQueen, cQueen, rObstacle):
    # row for i: rQueen + i - cQueen
    return sum([1 for i in range(cQueen-1, 0, -1) if (rQueen + i - cQueen) > rObstacle])

###

def replaceIfSmaller(values, value, index):
    values[index] = min(values[index], value)

n, k = map(int, input().strip().split(' '))
rQueen, cQueen = map(int, input().strip().split(' '))

# left, top, right, bottom, left-top, top-right, right-bottom, bottom-left 
cells = [cQueen - 1, n - rQueen, n - cQueen, rQueen - 1, calculateLeftTop(n, rQueen, cQueen), calculateTopRight(n, rQueen, cQueen), calculateRightBottom(n, rQueen, cQueen), calculateBottomLeft(n, rQueen, cQueen)]

for a0 in range(k):
    rObstacle, cObstacle = map(int, input().strip().split(' '))
    if isLeft(rQueen, cQueen, rObstacle, cObstacle):
        replaceIfSmaller(cells, cQueen - cObstacle - 1, 0)
    elif isUp(rQueen, cQueen, rObstacle, cObstacle):
        replaceIfSmaller(cells, rObstacle - rQueen - 1, 1)
    elif isRight(rQueen, cQueen, rObstacle, cObstacle):
        replaceIfSmaller(cells, cObstacle - cQueen - 1, 2)
    elif isDown(rQueen, cQueen, rObstacle, cObstacle):
        replaceIfSmaller(cells, rQueen - rObstacle - 1, 3)
    elif isLeftTop(rQueen, cQueen, rObstacle, cObstacle):
        replaceIfSmaller(cells, calculateLeftTopWithObstacle(n, rQueen, cQueen, rObstacle), 4)
    elif isTopRight(n, rQueen, cQueen, rObstacle, cObstacle):
        replaceIfSmaller(cells, calculateTopRightWithObstacle(n, rQueen, cQueen, rObstacle), 5)
    elif isRightBottom(rQueen, cQueen, rObstacle, cObstacle):
        replaceIfSmaller(cells, calculateRightBottomWithObstacle(n, rQueen, cQueen, rObstacle), 6)
    elif isBottomLeft(n, rQueen, cQueen, rObstacle, cObstacle):
        replaceIfSmaller(cells, calculateBottomLeftWithObstacle(n, rQueen, cQueen, rObstacle), 7)

print(sum(cells))
