"""Program to demonstrate required arguments in function."""

def greet(name, message):
    """name and message are required - must be passed in order."""
    print(message, name)

greet("Alice", "Hello,")
# greet("Bob")  # Error: missing required argument
