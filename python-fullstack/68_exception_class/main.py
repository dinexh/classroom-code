"""Program to demonstrate Exception class (custom exception)."""

class CustomError(Exception):
    pass

class ValueTooSmallError(Exception):
    def __init__(self, value):
        self.value = value
        super().__init__(f"Value {value} is too small")

try:
    num = int(input("Enter number (min 10): "))
    if num < 10:
        raise ValueTooSmallError(num)
    print("Valid:", num)
except ValueTooSmallError as e:
    print("Custom exception:", e)
