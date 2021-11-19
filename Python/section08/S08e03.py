vector = []

for index in range(0,10):
    vector.append(int(input("Please enter a number {0}/10: ".format(index+1))))

vector.reverse()
for index in vector:
    print(index)