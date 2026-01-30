"""Program to demonstrate Multiple Inheritance (one class, multiple bases)."""

class Flyer:
    def fly(self):
        print("Flying")

class Swimmer:
    def swim(self):
        print("Swimming")

class Duck(Flyer, Swimmer):
    def display(self):
        print("Duck")

d = Duck()
d.display()
d.fly()
d.swim()
