"""Program to demonstrate switch case using Dictionary."""

def case_1():
    return "One"

def case_2():
    return "Two"

def case_3():
    return "Three"

def default():
    return "Unknown"

switch = {
    1: case_1,
    2: case_2,
    3: case_3,
}

choice = int(input("Enter 1, 2 or 3: "))
result = switch.get(choice, default)()
print(result)
