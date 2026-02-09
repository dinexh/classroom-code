"""Program to demonstrate Non Parameterized Constructor."""

class Demo:
    def __init__(self):
        # No parameters - default initialization
        self.value = 0
        self.name = "Default"
        print("Non-parameterized constructor called")

    def display(self):
        print("Value:", self.value, "Name:", self.name)

obj = Demo()
obj.display()
