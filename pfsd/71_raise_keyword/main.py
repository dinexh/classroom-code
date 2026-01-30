"""Program to demonstrate raise keyword."""

def check_age(age):
    if age < 0 or age > 150:
        raise ValueError("Age must be between 0 and 150")
    if age < 18:
        raise ValueError("Must be 18 or older")
    return True

try:
    check_age(25)
    print("Valid age")
    check_age(-5)
except ValueError as e:
    print("Error:", e)
