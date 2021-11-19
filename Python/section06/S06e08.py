number = int(input ("Please enter a number : "))

if number % 2 == 0:
    if number > 0:
        print("\nThe number {0} is even and positive.".format(number))
    else: 
        print("\nThe number {0} is even and negative.".format(number))
else:
    if number > 0:
        print("\nThe number {0} is odd and positive.".format(number))
    else:
        print("\nThe number {0} is odd and negative.".format(number))