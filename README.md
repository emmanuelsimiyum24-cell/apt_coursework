# APT Coursework — Multi-Level Implementation

This repository contains coursework implementations across multiple levels, covering programming paradigms, system design, and domain-specific language (DSL) development.

---

# Level 2 — Analysis

## 1. Why Static Typing is Safer for Financial Systems

Static typing improves system safety by detecting type errors at compile time before execution. This prevents invalid data types (e.g., using strings in numeric calculations), which could lead to incorrect financial records.

### Key Advantages:
- Improved reliability  
- Higher accuracy  
- Early error detection  
- Reduced risk of costly mistakes  

This is especially critical in financial systems such as SACCOs, where data integrity is essential.

---

## 2. Why Dynamic Typing is Useful in Kenyan Startups

Dynamic typing enables faster development and greater flexibility, making it ideal for startup environments.

### Key Benefits:
- Rapid prototyping  
- Easier code modification  
- Reduced development time  
- Adaptability to changing requirements  

### Common Use Cases:
- Mobile applications  
- Fintech solutions  
- Startups requiring fast iteration  

---

#  Level 5 — Ride-Hailing Pricing Engine (Paradigm Comparison)

## Overview

This project compares three programming paradigms used to implement a ride-hailing pricing engine.

### Pricing Model:
- Base fare: 200 KES  
- Cost per kilometer: 50 KES  
- Total fare = Base fare + (Distance × Cost per km)

---

## Paradigm Implementations

### Procedural Approach (C++)

Uses functions to perform tasks. The main program handles input/output, while a function calculates the fare.

**Pros:**
- Simple and easy to understand  

**Cons:**
- Difficult to maintain as the system grows  
- Tightly coupled logic  

---

### Object-Oriented Approach (Java)

Uses classes to encapsulate data and behavior.

**Pros:**
- Better code organization  
- Easier maintenance and scalability  
- Supports extension with minimal changes  

---

### Functional Approach (Python)

Uses concise expressions (e.g., lambda functions) to define logic.

**Pros:**
- Short and expressive code  

**Cons:**
- Less suitable for complex systems  
- Harder to manage when logic grows  

---

## Comparison of Paradigms

| Paradigm         | Strengths                | Weaknesses              |
|-----------------|-------------------------|--------------------------|
| Procedural      | Simple, straightforward | Poor scalability         |
| Object-Oriented | Flexible, maintainable  | Slightly more complex    |
| Functional      | Concise, expressive     | Limited for large systems|

---

## Scalability and Extension

Object-oriented programming is the most scalable approach.

Example: Adding surge pricing  
- OOP: Add a new method or attribute  
- Procedural: Modify multiple functions  
- Functional: Increases complexity of expressions  

---

## Conclusion

All paradigms can solve the problem, but:

- **OOP** → Best for scalability and maintenance  
- **Procedural** → Best for simple tasks  
- **Functional** → Best for small, isolated computations  

---

# Level 6 — Scope, Memory, and Error Handling  
## Patient Record Access Control System

## Overview

This project demonstrates how scope, memory management, and error handling can be used to enforce secure access to patient records in a hospital system.

Only users with the role **"Doctor"** are allowed access.

---

## Lexical (Static) Scope

Lexical scope restricts variable access based on code structure.

### Benefits:
- Enhances security  
- Prevents unauthorized access  
- Improves predictability of data flow  

Sensitive data remains confined to specific functions, reducing risk.

---

## Dynamic Scope Risks

Dynamic scope determines access based on runtime execution.

### Risks:
- Unauthorized data exposure  
- Functions accessing unintended variables  
- Potential violation of confidentiality  

This makes it unsuitable for secure systems like healthcare.

---

## Memory Management

### Stack Memory:
- Stores local variables  
- Temporary (exists during function execution only)  
- Improves security by limiting data lifetime  

### Heap Memory:
- Stores dynamically allocated data  
- Persists until explicitly removed  
- Requires careful management  

---

## Exception Handling

Used to enforce access control by raising errors when unauthorized access occurs.

### Benefits:
- Prevents system crashes  
- Handles violations gracefully  
- Strengthens system security  

---

## Conclusion

Combining lexical scope, proper memory handling, and exception management ensures a secure and reliable system for handling sensitive patient data.

---

# Level 7 — Capstone Implementation  
## Mini DSL for Mobile Money Rules

## Overview

This project implements a simple Domain-Specific Language (DSL) for mobile money transactions.

### Example Command:
TRANSFER 5000 FROM A TO B IF BALANCE > 1000

---

## Features

- Command parsing using regular expressions  
- Extraction of:
  - Amount  
  - Sender  
  - Receiver  
- Balance validation  
- Transaction execution  
- Error handling  

---

## Reflection

### 1. Why Python is Suitable for DSL Prototyping

Python provides:
- Simple and readable syntax  
- Fast development and testing  
- Built-in libraries like `re` for parsing  
- Dynamic typing for flexibility  

---

### 2. Why C++ is Less Suitable

- Requires compilation after changes  
- More complex syntax  
- Strict typing slows development  
- Manual memory management  

---

### 3. Role of AI Code Assistants in Kenya

AI tools can:
- Generate and optimize code  
- Detect and fix errors quickly  
- Accelerate development  

In Kenya’s mobile-money-driven economy, this enables faster creation of financial systems and supports innovation in fintech.

---

## Conclusion

This project demonstrates how Python can be effectively used to design a simple DSL for mobile money transactions, emphasizing flexibility, speed, and real-world applicability.

---