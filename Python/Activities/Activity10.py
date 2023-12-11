tuple1 = tuple(input("Enter Items: ").split())
print(tuple1)

tuple2 = ()
for num in tuple1:
    if int(num) % 5 == 0:
        print(num)
