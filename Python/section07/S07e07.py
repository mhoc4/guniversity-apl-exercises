mouseQuantity = 0
needsSphere = 0
needsCleaning = 0
needsConectorOrCableChange = 0
brokenOrUseless = 0
needsSpherePercentage = 0
needsCleaningPercentage = 0
needsConectorOrCableChangePercentage = 0
brokenOruselessPercentage = 0

mouseCode = int(input("\nPlease enter a mouse code, enter 0 to show results: "))

if mouseCode != 0:
    while mouseCode != 0:
        
        optionCode = int(input("\nPlease choose an option:\n1 - needs sphere.\n2 - needs cleaning\n3 - needs conector or cable change\n4 - broken or useless\n"))
        
        if optionCode > 1 or optionCode < 4:
            while optionCode < 1 or optionCode > 4:
                optionCode = int(input("\nNo such code, please choose between 1 and 4: \n1 - needs sphere.\n2 - needs cleaning\n3 - needs conector or cable change\n4 - broken or useless\n"))
     
        if optionCode == 1:
            needsSphere += 1
        elif optionCode == 2:
            needsCleaning += 1
        elif optionCode == 3:
            needsConectorOrCableChange += 1
        else:
            brokenOrUseless += 1
        
        mouseQuantity += 1
        print("\nMouse status saved.\n")
        mouseCode = int(input("\nPlease enter a mouse code, enter 0 to show results: "))

    if mouseQuantity != 0:
        needsSpherePercentage = (needsSphere / mouseQuantity) * 100
        needsCleaningPercentage = (needsCleaning / mouseQuantity) * 100
        needsConectorOrCableChangePercentage = (needsConectorOrCableChange / mouseQuantity) * 100
        brokenOruselessPercentage = (brokenOrUseless / mouseQuantity) * 100

print("\nMouse quantity: {0}\n".format(mouseQuantity))
print("Status                             Quantity    Percentage")
print("1 - needs sphere                   {0}           {1:.2f}%".format(needsSphere, needsSpherePercentage))
print("2 - needs cleaning                 {0}           {1:.2f}%".format(needsCleaning, needsCleaningPercentage))
print("3 - needs conect or cable change   {0}           {1:.2f}%".format(needsConectorOrCableChange, needsConectorOrCableChangePercentage))
print("4 - broken or useless              {0}           {1:.2f}%".format(brokenOrUseless, brokenOruselessPercentage))