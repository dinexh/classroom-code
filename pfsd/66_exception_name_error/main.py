"""Program to demonstrate Exception Handling (NameError)."""

try:
    x = some_unknown_variable + 1
except NameError as e:
    print("NameError caught:", e)
