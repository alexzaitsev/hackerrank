# https://www.hackerrank.com/challenges/ctci-balanced-brackets/problem

def is_matched(expression):
    stack = []
    for c in expression:
        if c == '(' or c == '{' or c == '[':
            stack.append(c)
        elif len(stack) == 0:
            return False
        else:
            pop = stack.pop()
            if (c == ')' and pop != '(') or (c == ']' and pop != '[') or (c == '}' and pop != '{'):
                return False
    return len(stack) == 0
            
t = int(input().strip())
for a0 in range(t):
    expression = input().strip()
    print("YES" if is_matched(expression) else "NO")
