Name = input()
out = []
for i in Name:
    if i not in out:
        out.append(i)
    else:
        continue
print("CHAT WITH HER!" if len(out)%2==0 else "IGNORE HIM!")