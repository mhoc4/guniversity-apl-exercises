swimmerAge = int(input ("Please enter the swimmer age: "))

if swimmerAge >= 18:
    print("Adult.")
elif swimmerAge >= 14:
    print("juvenile B.")
elif swimmerAge >= 12:
    print("juvenile A.")
elif swimmerAge >= 8:
    print("child B.")
elif swimmerAge >= 5:
    print("child A.")
else:
    print("This swimmer is not fit to any category.")