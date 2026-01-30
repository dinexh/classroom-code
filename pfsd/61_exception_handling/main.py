"""Program to demonstrate Exception Handling."""

try:
    a = int(input("Enter first number: "))
    b = int(input("Enter second number: "))
    result = a / b
    print("Result:", result)
except ZeroDivisionError:
    print("Cannot divide by zero")
except ValueError:
    print("Invalid input - enter numbers only")
except Exception as e:
    print("Error:", e)
else:
    print("No exception occurred")
finally:
    print("Finally block always runs")
