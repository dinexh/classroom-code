"""Program to demonstrate Method Overriding."""

class Animal:
    def speak(self):
        print("Animal speaks")

class Dog(Animal):
    def speak(self):
        print("Dog barks")  # Overrides parent speak

class Cat(Animal):
    def speak(self):
        print("Cat meows")  # Overrides parent speak

a = Animal()
d = Dog()
c = Cat()
a.speak()
d.speak()
c.speak()
