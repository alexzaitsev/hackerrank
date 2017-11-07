# https://www.hackerrank.com/challenges/ctci-bubble-sort/problem

n = int(input().strip())
a = list(map(int, input().strip().split(' ')))

swaps = 0
isSorted = False
lastUnsorted = n - 1
while not isSorted:
    isSorted = True
    for i in range(lastUnsorted):
        if a[i] > a[i+1]:
            isSorted = False
            swaps += 1
            a[i], a[i+1] = a[i+1], a[i]
    lastUnsorted -= 1         

print("Array is sorted in", swaps, "swaps.")
print("First Element:", a[0])
print("Last Element:", a[-1])
