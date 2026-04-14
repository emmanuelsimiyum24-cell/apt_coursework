# Loop for continuous monitoring
while True:
    rainfall = float(input("\nEnter rainfall amount (mm): "))
    temperature = float(input("Enter temperature (°C): "))

    # If-Else Logic 
    print("\n If-Else Result")
    if rainfall < 200:
        print("Irrigation Required")
    elif rainfall >= 200 and temperature > 30:
        print("Monitor Soil")
    else:
        print("Normal Conditions")

    # Nested If Logic
    print("\n Nested If Result")
    if rainfall < 200:
        print("Irrigation Required")
    else:
        if temperature > 30:
            print("Monitor Soil")
        else:
            print("Normal Conditions")

    # Repeat Option
    choice = input("\nDo you want to check again? (yes/no): ")
    if choice.lower() != "yes":
        print("Program ended.")
        break