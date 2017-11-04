# https://www.hackerrank.com/challenges/ctci-ransom-note/problem

from collections import Counter

def ransom_note(magazine, ransom):
    magazineCounter = Counter(magazine)
    ransomCounter = Counter(ransom)
    numberOfInconsistencies = sum(1 for word, number in ransomCounter.items() if magazineCounter[word] < number)
    return 'No' if numberOfInconsistencies > 0 else 'Yes'

m, n = map(int, input().strip().split(' '))
magazine = input().strip().split(' ')
ransom = input().strip().split(' ')
print(ransom_note(magazine, ransom))
