pollutionIndex = float(input ("Please enter the pollution index value: "))

if pollutionIndex >= 0.5:
    print("All industries groups must suspend their activities.")
elif pollutionIndex >= 0.4:
    print("Industries of groups 1 and 2 must suspend their activities.")
elif pollutionIndex >= 0.3:
    print("Industries of group 1 must suspend their activities.")
else:
    print("The pollution index is at an acceptable level.")