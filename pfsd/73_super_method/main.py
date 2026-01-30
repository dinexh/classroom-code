"""Program to demonstrate super() method."""

class Parent:
    def show(self):
        print("Parent show")

class Child(Parent):
    def show(self):
        super().show()  # Call parent's show
        print("Child show")

c = Child()
c.show()
