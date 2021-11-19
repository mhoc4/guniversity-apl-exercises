p = float(input ("Please enter fish weight: "))
e = 0
m = 0
mValue = 4

if (p - 50 > 0):
    e = p - 50
    m = e * mValue

print("\nFish caught weight: {0:.2f}\nWeight overlimit: {1:.2f}\nFine value: R${2:.2f}".format(p,e,m))