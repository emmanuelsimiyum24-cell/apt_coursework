# SACCO Member Financial Record - Python

member_name = input("Enter Member Name: ")
member_id = input("Enter Member ID: ")

total_savings = 0

print("Enter monthly contributions for 6 months:")

for i in range(6):
    contribution = input(f"Month {i+1}: ")
    
    try:
        contribution = float(contribution) 
        total_savings += contribution
    except ValueError:
        print("Invalid input! Please enter a number.")

print("\n--- Member Record ---")
print("Name:", member_name)
print("ID:", member_id)
print("Total Savings:", total_savings)

print("\n--- Type Test (Assigning String) ---")

contribution = "KES5000" 

try:
    total_savings += contribution  
except TypeError as e:
    print("Runtime Error:", e)
    