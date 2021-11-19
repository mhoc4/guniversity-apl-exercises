personHeight = float(input ("How tall are you in meters? "))
personGender = input("Please enter your gender f/m. ")

if personGender.lower() == 'm':
    idealBMI = (72.7 * personHeight - 58)
elif personGender.lower() == 'f':
    idealBMI = (62.1 * personHeight) - 44.7
else:
    idealBMI = 0
    print("\nGender not found.")

print("\nYour ideal BMI is: {0:.2f}".format(idealBMI))