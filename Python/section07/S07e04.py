number = 0
biggestNumber = 0
lowestNumber = 0
averageNumber = 0

number = float(input("Please enter a number: "))
lowestNumber = number
averageNumber += number

for number in range(1, 10):
    number = float(input("Please enter a number: "))
    if range == 0:
        lowestNumber = number
    if number > biggestNumber:
        biggestNumber = number
    elif number < lowestNumber:
        lowestNumber = number
    averageNumber += number

averageNumber = averageNumber / 10

print("\nBiggest number: {0:.2f}\nLowest number: {1:.2f}\nAverage number: {2:.2f}".format(biggestNumber,lowestNumber,averageNumber))