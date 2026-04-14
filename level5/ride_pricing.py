# Lambda function
calculate_fare = lambda distance: 200 + (distance * 50)

# User input
distance = float(input("Enter distance (km): "))

# Calculate fare
total_fare = calculate_fare(distance)

# Output result
print("Total Fare:", total_fare, "KES")