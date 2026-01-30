"""Program to demonstrate Multiple Exceptions in one except."""

try:
    value = int(input("Enter number or press Enter: ") or "0")
    result = 10 / value
    data = [1, 2, 3]
    print(data[value])
except (ZeroDivisionError, ValueError, IndexError) as e:
    print("Caught one of: ZeroDivisionError, ValueError, IndexError:", type(e).__name__, e)
