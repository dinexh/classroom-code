"""Program to demonstrate variable length arguments in function."""

def sum_all(*args):
    """*args collects extra positional arguments as tuple."""
    total = 0
    for n in args:
        total += n
    return total

print("Sum:", sum_all(1, 2, 3))
print("Sum:", sum_all(1, 2, 3, 4, 5))

def print_info(**kwargs):
    """**kwargs collects keyword arguments as dict."""
    for key, value in kwargs.items():
        print(key, ":", value)

print_info(name="Alice", age=25, city="Mumbai")
