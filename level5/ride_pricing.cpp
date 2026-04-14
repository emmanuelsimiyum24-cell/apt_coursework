#include <iostream>
using namespace std;

// Function to calculate total fare
double calculateFare(double distance) {
    const double BASE_FARE = 200;
    const double COST_PER_KM = 50;

    return BASE_FARE + (distance * COST_PER_KM);
}

int main() {
    double distance;

    // User input
    cout << "Enter distance (km): ";
    cin >> distance;

    // Calculate fare
    double totalFare = calculateFare(distance);

    // Output result
    cout << "Total Fare: " << totalFare << " KES" << endl;

    return 0;
}