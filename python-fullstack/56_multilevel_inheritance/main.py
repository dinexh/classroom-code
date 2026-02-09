"""Program to demonstrate Multilevel Inheritance (A -> B -> C)."""

class Animal:
    def __init__(self):
        print("Animal")

class Mammal(Animal):
    def __init__(self):
        super().__init__()
        print("Mammal")

class Dog(Mammal):
    def __init__(self):
        super().__init__()
        print("Dog")

d = Dog()
