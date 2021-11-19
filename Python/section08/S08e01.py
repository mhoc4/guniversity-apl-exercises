numbersOne = []
numbersTwo = []
numbersSum = []

for index in range(0,10):
    numbersOne.append(int(input("Please enter first number {0}/10: ".format(index+1))))
    numbersTwo.append(int(input("Please enter second number {0}/10: ".format(index+1))))

    numbersSum.append(numbersOne[index] + numbersTwo[index])

print("\nList of sums by index")
for index in range(0,10):
    print("Sum of index {0}: {1}".format(index, numbersSum[index]))