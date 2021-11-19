vector = []
evenNumbers = []

for index in range(0,5):
    vector.append(int(input("Please enter a number {0}/5: ".format(index+1))))
    if vector[index] % 2 == 0:
        evenNumbers.append(vector[index])

for index in evenNumbers:
    print("Even number: {0}".format(index))