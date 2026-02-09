"""Program to demonstrate Parameterized Constructor."""

class Student:
    def __init__(self, name, roll_no, marks):
        self.name = name
        self.roll_no = roll_no
        self.marks = marks
        print("Parameterized constructor called")

    def display(self):
        print("Name:", self.name, "Roll:", self.roll_no, "Marks:", self.marks)

s = Student("Alice", 101, 85)
s.display()
