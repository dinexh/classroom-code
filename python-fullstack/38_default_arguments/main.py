"""Program to demonstrate default arguments in function."""

def greet(name, message="Hello"):
    print(message, name)

greet("Alice")           # message defaults to "Hello"
greet("Bob", "Hi")       # message is "Hi"

def power(base, exp=2):
    return base ** exp

print("5^2 =", power(5))
print("5^3 =", power(5, 3))
