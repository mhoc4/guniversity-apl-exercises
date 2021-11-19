p = 0
i = 0
number = int(input("Please enter a number: "))

if number % 2 == 0:
    p = number
else:
    i = number

print("\nEven number: {0}\nOdd number: {1}".format(p,i))

