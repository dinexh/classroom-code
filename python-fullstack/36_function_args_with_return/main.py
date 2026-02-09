"""Program to demonstrate function with arguments and with return value."""

def add(a, b):
    return a + b

def max_of_two(a, b):
    return a if a > b else b

print("Sum:", add(10, 20))
print("Max:", max_of_two(15, 8))
