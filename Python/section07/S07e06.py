number = 0

number = int(input("Please enter a number between 1 and 10 to calculate it's times table: "))
while number < 1 or number > 10:
    number = int(input("The number must be between 1 and 10, try again: "))
print("\n{0} Times table".format(number))
for index in range(1, 11):
    print("{0} X {1} = {2}".format(number, index, number * index))