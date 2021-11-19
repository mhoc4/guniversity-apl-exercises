vector = []
numberBiggerThanFifty = []
isNumberBiggerThanFifty = False

for index in range(0,10):
    vector.append(int(input("Please enter a number {0}/10: ".format(index+1))))
    if vector[index] > 50:
        numberBiggerThanFifty.append(vector[index])
        isNumberBiggerThanFifty = True

for index in numberBiggerThanFifty:
        print("Number {0} at index {1} is bigger than 50.".format(index, numberBiggerThanFifty.index(index)))

if isNumberBiggerThanFifty == False:
    print("\nThere is no number bigger than 50.")