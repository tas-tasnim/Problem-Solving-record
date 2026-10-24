n , h = map(int, input().split())
a = list(map(int, input().split()))
out = sum(2 if i > h else 1 for i in a)
print(out)
