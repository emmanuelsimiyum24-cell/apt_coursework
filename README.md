# -apt_coursework-
course work in levels

## Level Two Analysis

### 1. Why Static Typing is Safer for Financial Systems

Static typing is safer because it detects type errors at compile time before the program runs. This prevents invalid data, such as strings being used in calculations, which could lead to incorrect financial records.

It ensures:
- Reliability
- Accuracy
- Early error detection
- Reduced risk of costly mistakes

This is especially important in sensitive systems like SACCOs where data integrity is critical.

---

### 2. Why Dynamic Typing is Useful in Kenyan Startups

Dynamic typing is advantageous in Kenyan startup environments because it allows faster development and greater flexibility.

Key benefits include:
- Rapid prototyping
- Easier code modifications
- Reduced development time
- Adaptability to changing business needs

It is ideal for:
- Mobile applications
- Fintech solutions
- Startups requiring quick iterations

---
# Ride-Hailing Pricing Engine — Paradigm Comparison (Level 5)

## Overview
This project explores how different programming paradigms can be used to implement a simple ride-hailing pricing engine based on distance. The system applies a fixed pricing model where the base fare is 200 KES and the cost per kilometer is 50 KES. The total fare is calculated by adding the base fare to the product of distance and cost per kilometer. Three approaches were used to implement this logic: procedural programming in C++, object-oriented programming (OOP) in Java, and functional programming in Python.

## Paradigm Implementation
In the procedural approach, the program is structured around functions that perform specific tasks. A single function is used to calculate the fare, and the main program handles input and output. This approach is straightforward and easy to understand, especially for small programs. However, as the system grows, it may become difficult to manage because all logic is centralized and tightly coupled.

The object-oriented approach organizes the program into classes and methods. A class is used to represent the ride pricing system, encapsulating the base fare and cost per kilometer as attributes, and providing a method to compute the total fare. This structure improves code organization by grouping related data and behavior together. It also makes the system easier to extend and maintain, as new features can be added with minimal changes to existing code.

The functional approach in Python uses a lambda function to define the pricing logic in a concise and expressive way. This approach emphasizes simplicity and reduces the amount of code required to perform the calculation. While it is effective for small, well-defined tasks, it may become less practical when the system requires more complex logic or multiple interacting features.

## Comparison of Paradigms
When comparing the three paradigms, the object-oriented approach provides the most flexibility and scalability. It allows developers to extend the system by adding new methods or modifying existing ones without disrupting the overall structure. Procedural programming, while simple, becomes harder to maintain as more features are introduced because changes often require modifying multiple parts of the code. The functional approach is elegant and compact but is better suited for isolated computations rather than full system design.

## Scalability and Extension
If additional features such as surge pricing are introduced, the object-oriented approach scales the best. Surge pricing could be implemented by adding a new parameter or method within the class, making it easy to integrate without rewriting the entire program. In contrast, the procedural approach would require modifying existing functions, increasing the risk of errors. The functional approach would also need adjustments to the lambda function, which can quickly become complex and harder to read.

## Conclusion
In conclusion, while all three paradigms can solve the problem effectively, object-oriented programming is the most suitable for building scalable and maintainable systems. Procedural programming is ideal for simple tasks, and functional programming is useful for concise computations. For real-world applications such as ride-hailing systems, OOP provides the best balance between structure, flexibility, and long-term maintainability.

# README — Level 6: Scope, Memory, and Error Handling  
## Patient Record Access Control System

This project explores critical programming concepts within the context of a hospital patient record system, with particular focus on scope, memory management, and error handling. The implementation demonstrates how role-based access control can be enforced using functions that restrict access to sensitive patient data. Specifically, the system allows access only when the user role is identified as "Doctor" and raises an error otherwise. This ensures that unauthorized users are prevented from accessing confidential medical records.

A key concept illustrated in this project is lexical scope, also known as static scope. Lexical scope determines variable accessibility based on the structure of the code, meaning that variables are only accessible within the block or function in which they are defined. This significantly improves security in hospital systems because sensitive data, such as patient names or diagnoses, remains confined to specific functions. As a result, only authorized sections of the program can interact with such data, reducing the likelihood of unintended access or modification. Furthermore, lexical scope enhances predictability, allowing developers and security auditors to clearly understand how data flows within the system.

In contrast, dynamic scope determines variable access based on the program’s execution path at runtime. While this approach may offer flexibility, it introduces serious risks in sensitive environments such as healthcare systems. With dynamic scope, a function may access variables from another function simply because it appears in the call stack, even if such access was not intended. This can lead to unauthorized exposure of patient information, especially when unrelated components such as billing or logging functions gain access to medical data. Such behavior compromises confidentiality and violates fundamental data protection principles.

Another important aspect demonstrated in this project is variable lifetime and memory behavior. Variables declared within a function exist only during the execution of that function and are stored in stack memory. Once the function execution is complete, these variables are destroyed, ensuring that sensitive information does not persist longer than necessary. This temporary nature of stack memory contributes to system security by minimizing the risk of data retention. In contrast, heap memory is used for dynamically allocated data, which persists until it is explicitly removed, and therefore requires careful management in real-world applications.

The project also highlights the importance of exception handling in enforcing access control. By raising and catching errors when unauthorized access is attempted, the system ensures that violations are handled gracefully without crashing the program. This not only improves system reliability but also strengthens security by preventing unauthorized operations from proceeding silently.

## Conclusion

In conclusion, the use of lexical scope, proper memory management, and structured exception handling provides a strong foundation for building secure and reliable hospital information systems. Lexical scope, in particular, plays a crucial role in maintaining data confidentiality by restricting access to sensitive variables, while dynamic scope presents significant risks that make it unsuitable for such environments. These principles are essential in designing systems that handle critical data such as patient records.

# LEVEL 7 — Capstone Implementation
## Mini DSL for Mobile Money Rules

---

##  Overview
This project implements a simple Domain-Specific Language (DSL) for mobile money transactions.

Example command:
TRANSFER 5000 FROM A TO B IF BALANCE > 1000

The system:
- Parses the command
- Extracts transaction details
- Validates balance conditions
- Executes the transaction

---

## Features
- Command parsing using regex
- Extracts:
  - Amount
  - Sender
  - Receiver
- Balance validation
- Transaction execution
- Error handling

---

## Reflection

### 1. Why Python is suitable for DSL prototyping
Python is ideal for DSL development because of its simple syntax and readability. It allows fast development and testing. Built-in libraries like `re` make parsing easy. Dynamic typing enables flexible and quick modifications of rules.

---

### 2. Why C++ would be harder for rapid rule iteration
C++ requires compilation for every change, making it slower for testing. It also has strict typing and more complex syntax. Memory management adds extra work, making rapid DSL development harder.

---

### 3. How AI code assistants help DSL development in Kenya
AI tools help generate code, debug errors, and suggest improvements quickly. In Kenya, where mobile money (like M-Pesa) is widely used, AI can help developers build financial rule systems faster, improving innovation and efficiency.

---

## Conclusion
This project demonstrates how Python can be used to design a simple DSL for mobile money transactions efficiently.