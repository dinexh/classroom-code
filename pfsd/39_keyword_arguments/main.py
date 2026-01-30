"""Program to demonstrate keyword arguments in function."""

def describe(name, age, city):
    print(name, "is", age, "years old, lives in", city)

# Keyword arguments - order doesn't matter
describe(name="Alice", age=25, city="Mumbai")
describe(city="Delhi", name="Bob", age=30)
describe("Charlie", city="Chennai", age=22)
