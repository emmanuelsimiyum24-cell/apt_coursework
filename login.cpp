#include <iostream>
using namespace std;

int main() {
    string correctUsername = "EMMANUEL";
    string correctPassword = "MANU254";

    string username, password;

    cout << "Enter username: ";
    cin >> username;

    cout << "Enter password: ";
    cin >> password;

    
    if (username == correctUsername && password == correctPassword) {
        cout << "Access Granted" << endl;
    } else {
        cout << "Invalid Credentials" << endl;
    }

    
    cout << "\n--- Logical Error Demo ---" << endl;

    
    if (username == correctUsername || password == correctPassword) {
        cout << "Access Granted (WRONG LOGIC)" << endl;
    } else {
        cout << "Invalid Credentials" << endl;
    }

    return 0;
}