"""Program to demonstrate Hybrid Inheritance (mix of multiple and multilevel)."""

class Animal:
    def __init__(self):
        print("Animal")

class Mammal(Animal):
    def __init__(self):
        super().__init__()
        print("Mammal")

class Bird(Animal):
    def __init__(self):
        super().__init__()
        print("Bird")

class Bat(Mammal, Bird):
    def __init__(self):
        super().__init__()
        print("Bat")

b = Bat()
