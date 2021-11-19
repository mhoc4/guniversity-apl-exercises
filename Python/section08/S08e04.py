vector = []

for index in range(0,20):
    vector.append(int(input("Please enter a number {0}/20: ".format(index+1))))

print("\nThe sum of the vector is: {0}".format(sum(vector)))