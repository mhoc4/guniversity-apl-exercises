workTimeValue = float(input ("How much is your work time value? "))
totalWorkHours = int(input ("How many hours have you worked this month? "))

totalWage = workTimeValue * totalWorkHours

print("The total wage you gonna earn this month is: {0:.2f}".format(totalWage))