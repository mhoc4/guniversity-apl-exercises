number1 = int(input ("Please enter number 1: "))
number2 = int(input ("Please enter number 2: "))
number3 = int(input ("Please enter number 3: "))
number4 = int(input ("Please enter number 4: "))

square1 = number1 * number1
square2 = number2 * number2
square3 = number3 * number3
square4 = number4 * number4

if square3 >= 1000:
    print(square3)
else:
    print("number 1: {0}, Square: {1}".format(number1,square1))
    print("number 2: {0}, Square: {1}".format(number2,square2))
    print("number 3: {0}, Square: {1}".format(number3,square3))
    print("number 4: {0}, Square: {1}".format(number4,square4))