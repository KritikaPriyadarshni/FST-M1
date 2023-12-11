def fibonacci(number):
    if number <= 1:
        return number
    else:
        return fibonacci(number - 1) + fibonacci(number - 2)


ntimes = int(input("Enter a no.:"))

if ntimes <= 0:
    print("Enter positive number")
else:
    print("Fibonacci sequence is:")
    for i in range(ntimes):
        print(fibonacci(i))