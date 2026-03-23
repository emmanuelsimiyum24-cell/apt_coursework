# Hardcoded credentials
correct_username = "adminKE"
correct_password = "254Secure"

# User input
username = input("Enter username: ")
password = input("Enter password: ")

# Validation
if username == correct_username and password == correct_password:
    print("Access Granted")
else:
    print("Invalid Credentials")