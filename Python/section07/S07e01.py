number = -1
biggestNumber = 0

number = int(input("Please enter a number, enter 0 to stop: "))
while number != 0:
    
    if number > biggestNumber:
        biggestNumber = number
    number = int(input("Please enter a number, enter 0 to stop: "))
    
print("\nThe biggest entered number was: {0}".format(biggestNumber))