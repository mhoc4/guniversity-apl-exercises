c = int(input ("Please enter employee code: "))
n = int(input ("Please enter total worked time in hours: "))
e = 0
s = 0
regularWorkTimeLimit = 50
regularWorkTimeValue = 10
overTimeValue = 20
totalWage = 0

if (n > 50):
    e = (n - regularWorkTimeLimit) * overTimeValue
    s = regularWorkTimeLimit * regularWorkTimeValue
    totalWage = e + s
else:
    s = regularWorkTimeValue * n
    totalWage = s

print("\nTotal wage: R$ {0:.2f}\nOvertime wage: R$ {1:.2f}".format(totalWage,e))