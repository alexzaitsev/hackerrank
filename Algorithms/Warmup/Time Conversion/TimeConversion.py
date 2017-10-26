#!/bin/python3

import sys

def timeConversion(s):
    timeParts = s.split(":")
    hours = int(timeParts[0])
    minutes = int(timeParts[1])
    seconds = int(timeParts[2][:2]);
    pm = timeParts[2][2:] == "PM"
    if hours == 12:
        hours = 12 if pm else 0
    elif pm:
        hours += 12
        if hours > 23:
            hours -= 24
    return ("0" + str(hours) if hours < 10 else str(hours)) + ":" + ("0" + str(minutes) if minutes < 10 else str(minutes)) + ":" + ("0" + str(seconds) if seconds < 10 else str(seconds))

s = input().strip()
result = timeConversion(s)
print(result)
