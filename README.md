# 🔢 Prime Number Checker & Generator

A simple Java program that can **check whether a number is prime** and also **generate all prime numbers up to a given limit**.

This program was created as a practical exercise to understand how basic Java concepts can be combined to solve a real mathematical problem.

---

## ✨ What This Program Does

The program performs two main tasks:

1. **Prime Number Check**
   Takes a number from the user and checks whether it is prime or not.

2. **Prime Number Range**
   Takes a limit from the user and displays all prime numbers up to that limit.

---

## 🚀 Major Features

* ✅ Checks whether a given number is prime
* 🔢 Generates prime numbers within a specified range
* ⌨️ Takes input directly from the user
* ♻️ Uses reusable methods for prime checking
* 🔀 Uses `if-else`, `while`, `break`, and `continue`
* 🛡️ Handles `0` and `1` as non-prime numbers
* 📦 Uses Java's `Scanner` class for input
* 🧩 Separates the prime-checking logic into a dedicated method

---

## 🔄 Program Flow

The program follows this simple flow:

```text
             ┌─────────────────┐
             │   Start Program │
             └────────┬────────┘
                      ↓
             ┌─────────────────┐
             │ Enter a Number  │
             └────────┬────────┘
                      ↓
             ┌─────────────────┐
             │   is_prime()    │
             └────────┬────────┘
                      ↓
              ┌───────────────┐
              │ Prime or Not? │
              └───────┬───────┘
                      ↓
             ┌─────────────────┐
             │ Enter the Range │
             └────────┬────────┘
                      ↓
             ┌─────────────────┐
             │  prime_range()  │
             └────────┬────────┘
                      ↓
             ┌─────────────────┐
             │ Display Primes   │
             └────────┬────────┘
                      ↓
             ┌─────────────────┐
             │       End       │
             └─────────────────┘
```

---

## 🧠 How the Logic Works

### 1. `is_prime(int n)`

This method is responsible for checking whether a number is prime.

* If the number is `0` or `1`, it returns `false`.
* The program checks whether the number is divisible by any number from `2` to `n/2`.
* If a divisor is found, the number is not prime.
* If no divisor is found, the method returns `true`.

```java
static boolean is_prime(int n)
```

The method returns a **boolean value**, which makes the result easy to use in conditions.

---

### 2. `prime_range(int n)`

This method generates prime numbers up to the given limit.

It starts from `0` and checks each number using the `is_prime()` method.

```java
if (!is_prime(i)) {
    i++;
    continue;
}
```

If the current number is not prime, `continue` skips it and moves to the next number.

When the required limit is reached, `break` stops the loop.

---

## 📚 What I Learned

While making this program, I learned how to:

* Create and call **user-defined methods** in Java.
* Return values from methods using the `return` statement.
* Use the **boolean data type** for decision-making.
* Take user input using the **Scanner class**.
* Apply `if-else` conditions to solve problems.
* Use `while` and `for` loops effectively.
* Understand the use of **`break` and `continue`**.
* Reuse one method inside another method.
* Handle special cases such as `0` and `1`.
* Convert a mathematical concept into a working Java program.
* Improve my logical thinking and problem-solving approach.

---

## 🛠️ Concepts Used

| Concept      | Where It Is Used                 |
| ------------ | -------------------------------- |
| Methods      | `is_prime()` and `prime_range()` |
| Boolean      | Prime/non-prime result           |
| `if-else`    | Decision making                  |
| `for` loop   | Checking divisibility            |
| `while` loop | Generating prime numbers         |
| `break`      | Stopping the range loop          |
| `continue`   | Skipping non-prime numbers       |
| Scanner      | Taking user input                |
| `return`     | Returning the result             |

---

## 💻 Example

### Input

```text
Enter a number to be checked:
17

Enter range for prime numbers:
20
```

### Output

```text
Entered number is a prime number

All the prime numbers till: 20
2    3    5    7    11    13    17    19
```

---

## 📁 Project Structure

```text
Java-Programming-Practicals/
│
├── 01-Basics/
│   └── Prime_check.java
│
└── README.md
```

---

## 🎯 Purpose

This program is a small but useful exercise for building a strong foundation in Java programming. It combines **mathematical logic, methods, loops, conditions, and user input** in one program.

> **Learn the logic → Write the code → Test the result → Improve the solution.**

---

## 🔮 Possible Improvements

In the future, this program can be improved by:

* Checking divisibility only up to `√n` for better efficiency.
* Adding a menu-based interface.
* Handling negative numbers separately.
* Allowing the user to repeatedly check numbers without restarting the program.
* Adding better input validation.

---

### 👨‍💻 Language

**Java**

### 📌 Project Type

**Programming Practical / Beginner Java Project**
