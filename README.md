# odd-series

A simple Java console application that prints all odd numbers from 1 up to a given limit.

## 🔧 Prerequisites
- Java Development Kit (JDK) 8 or higher
- Access to the command line / terminal

## ▶️ Usage

```bash
# Compile
javac oddSeries.java

# Run
java oddSeries
Enter the number to get the odd number series : 10
# Output:
# 1
# 3
# 5
# 7
# 9
⚙️ How it works
Prompts the user for a positive integer n.

Iterates from 1 to n, stepping by 2, ensuring only odd numbers are considered.

Prints each odd number on a new line.

Includes input validation to ensure n is positive.

✅ Improvements
Small and efficient: no unnecessary modulus checks.

Safe: handles non-positive inputs gracefully and closes the scanner.

Clean code: follows Java conventions and logical structure.

🤝 Contributing
Contributions are welcome! Whether it's refactoring for readability, adding unit tests, or extending functionality:

Fork the repository.

Create a feature branch (e.g. feature/add-tests).

Commit your changes.

Open a pull request detailing your improvements.
