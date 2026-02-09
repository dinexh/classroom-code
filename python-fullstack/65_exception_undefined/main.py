"""Program to demonstrate Exception Handling (undefined variable)."""

try:
    print(undefined_var)  # NameError - undefined
except NameError as e:
    print("NameError:", e)
    print("Variable is not defined")
