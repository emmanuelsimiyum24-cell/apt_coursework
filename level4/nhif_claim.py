# Patient Class
class Patient:
    def __init__(self, name, policy_number):
        self.name = name
        self.policy_number = policy_number

    # Method to calculate claim
    def calculate_claim(self, amount):
        copayment = amount * 0.10
        return amount - copayment


# Procedural Function
def calculate_claim(amount):
    copayment = amount * 0.10
    return amount - copayment

# Main Program
name = input("Enter patient name: ")
policy = input("Enter policy number: ")
amount = float(input("Enter claim amount: "))

# OOP approach
patient = Patient(name, policy)
oop_result = patient.calculate_claim(amount)

# Procedural approach
procedural_result = calculate_claim(amount)

# Output
print("\n--- NHIF CLAIM SUMMARY (OOP) ---")
print("Patient:", patient.name)
print("Policy No:", patient.policy_number)
print("Approved Claim:", oop_result)

print("\n--- NHIF CLAIM SUMMARY (Procedural) ---")
print("Patient:", name)
print("Policy No:", policy)
print("Approved Claim:", procedural_result)