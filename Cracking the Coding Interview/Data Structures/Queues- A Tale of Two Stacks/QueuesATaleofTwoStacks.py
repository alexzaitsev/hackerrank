# https://www.hackerrank.com/challenges/ctci-queue-using-two-stacks/problem

class MyQueue(object):
    def __init__(self):
        self.stackNewest = []
        self.stackOldest = []
    
    def peek(self):
        self.transfer()
        return self.stackOldest[-1]
        
    def pop(self):
        self.transfer()
        return self.stackOldest.pop()
        
    def put(self, value):
        self.stackNewest.append(value)
        
    def transfer(self):
        if len(self.stackOldest) == 0:
            while len(self.stackNewest) != 0:
                self.stackOldest.append(self.stackNewest.pop())

queue = MyQueue()
t = int(input())
for line in range(t):
    values = map(int, input().split())
    values = list(values)
    if values[0] == 1:
        queue.put(values[1])        
    elif values[0] == 2:
        queue.pop()
    else:
        print(queue.peek())
        
