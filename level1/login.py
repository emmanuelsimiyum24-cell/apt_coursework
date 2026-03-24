# ===== CORRECT VERSION =====
correct_username = "EMMANUEL"
correct_password = "Manu123"

username = input("Enter username: ")
password = input("Enter password: ")

if username == correct_username and password == correct_password:
    print("Access Granted")
else:
    print("Invalid Credentials")

print("\n--- Logical Error Demo ---")

if username == correct_username or password == correct_password:
    print("Access Granted (WRONG LOGIC)")
else:
    print("Invalid Credentials")