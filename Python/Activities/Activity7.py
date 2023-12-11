listitem1 = input("Enter item")
splititems = listitem1.split()
print(splititems)


sum = 0
for i in splititems:
    sum = sum + int(i)
print("Sun is:", sum)
