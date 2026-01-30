"""Program to demonstrate Multiple except blocks."""

try:
    a = int(input("Enter a: "))
    b = int(input("Enter b: "))
    print(a / b)
    print([1, 2, 3][a])
except ZeroDivisionError:
    print("Division by zero")
except ValueError:
    print("Invalid number input")
except IndexError:
    print("Index out of range")
