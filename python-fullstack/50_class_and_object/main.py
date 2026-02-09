"""Program to demonstrate class and object."""

class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def display(self):
        print("Name:", self.name, "Age:", self.age)

# Create objects
p1 = Person("Alice", 25)
p2 = Person("Bob", 30)

p1.display()
p2.display()
