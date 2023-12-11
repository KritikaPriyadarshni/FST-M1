listitem1 = input("Enter item for list1: ")
splititems1 = listitem1.split()
print(splititems1)

listitem2 = input("Enter item for list 2: ")
splititems2 = listitem2.split()
print(splititems2)
list3 = []
for num in splititems1:
    if int(num) % 2 != 0:
        list3.append(num)

for num in splititems2:
    if int(num) % 2 == 0:
        list3.append(num)

print("Third list:", list3)

