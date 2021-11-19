vector = []
evenNumbers = []

for index in range(0,10):
    vector.append(int(input("Please enter a number {0}/10: ".format(index+1))))
    if vector[index] % 2 == 0:
        evenNumbers.append(vector[index])

print("\nList of even numbers")
for index in evenNumbers:
    print("Even number: {0}".format(index))