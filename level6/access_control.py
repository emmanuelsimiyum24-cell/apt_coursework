class AccessDeniedError(Exception):
    """Custom exception for unauthorized access"""
    pass


def checkAccess(role):
    """Checks if the user has permission to access patient records"""
    if role != "Doctor":
        raise AccessDeniedError(
            "Access denied: Only doctors can access patient records."
        )
    return "Access granted to patient records."


# Demo Usage
if __name__ == "__main__":

    try:
        print(checkAccess("Nurse"))
    except AccessDeniedError as e:
        print("Error:", e)

    try:
        print(checkAccess("Doctor"))
    except AccessDeniedError as e:
        print("Error:", e)


# Scope Experiment
def patient_record():
    patient_name = "John Doe"
    print("Inside function:", patient_name)


patient_record()

# Accessing variable outside its scope
try:
    print(patient_name)
except NameError as e:
    print("Scope Error:", e)