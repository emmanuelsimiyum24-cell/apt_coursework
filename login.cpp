#include <iostream>
using namespace std;

int main() {
    // Hardcoded credentials
    string correctUsername = "adminKE";
    string correctPassword = "254Secure";

    string username, password;

    // User input
    cout << "Enter username: ";
    cin >> username;

    cout << "Enter password: ";
    cin >> password;

    // Validation
    if (username == correctUsername && password == correctPassword) {
        cout << "Access Granted" << endl;
    } else {
        cout << "Invalid Credentials" << endl;
    }

    return 0;
}