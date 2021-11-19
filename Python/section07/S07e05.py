login = input("\nPlease enter your login: ")
password = input("Please enter your password: ")
if password == login:
    while login == password:
        print("\nYour password can't be identical than your password.\nPlease try again.")
        login = input("\nPlease enter your login: ")
        password = input("Please enter your password: ")
print("\nYou have succesfully logged in.")