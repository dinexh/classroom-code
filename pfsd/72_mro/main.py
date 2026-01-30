"""Program to demonstrate Method Resolution Order (MRO)."""

class A:
    def method(self):
        print("A")

class B(A):
    def method(self):
        print("B")

class C(A):
    def method(self):
        print("C")

class D(B, C):
    pass

print("MRO for D:", D.__mro__)
d = D()
d.method()  # B (first in MRO)
