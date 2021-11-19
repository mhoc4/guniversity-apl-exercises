vector = []
optionCode = -1

while optionCode != 0:
    optionCode = int(input("\nPlease choose an option:\n1 - Show the numbers in direct order.\n2 - Show the numbers in reverse order.\n0 - Quit.\n"))

    if optionCode < 0 or optionCode > 2:
        while optionCode < 0 or optionCode > 2:
            optionCode = int(input("No such code, please try again:\n1 - Show the numbers in direct order.\n2 - Show the numbers in reverse order.\n0 - Quit.\n"))
    elif optionCode == 1 or optionCode == 2:
        for index in range(0,5):
            vector.append(float(input("Please enter a number for {0}/5: ".format(index+1))))
        
        if optionCode == 2:
            vector.reverse()
            print("\nShowing in inverse order: ")
            for index in range(0,5):
                print(vector[index])
        elif optionCode == 1:
            print("\nShowing in direct order: ")
            for index in range(0,5):
                print(vector[index])
    else:
            print("You chose to quit.")
        