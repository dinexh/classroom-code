"""Program to demonstrate super() & constructor method."""

class Person:
    def __init__(self, name):
        self.name = name
        print("Person init:", name)

class Student(Person):
    def __init__(self, name, roll_no):
        super().__init__(name)  # Call parent constructor
        self.roll_no = roll_no
        print("Student init:", roll_no)

s = Student("Alice", 101)
