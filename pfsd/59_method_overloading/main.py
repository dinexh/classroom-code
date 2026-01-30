"""Program to demonstrate Method Overloading (Polymorphism) - Python style."""

# Python doesn't support traditional overloading; use default args or *args
class MathOps:
    def add(self, a, b=0, c=0):
        return a + b + c

    # Alternative: different method names or *args
    def add_many(self, *args):
        return sum(args)

m = MathOps()
print("add(1,2):", m.add(1, 2))
print("add(1,2,3):", m.add(1, 2, 3))
print("add_many(1,2,3,4):", m.add_many(1, 2, 3, 4))
