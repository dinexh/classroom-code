"""Program to demonstrate public & protected properties."""

class Demo:
    def __init__(self):
        self.public = "I am public"       # public
        self._protected = "I am protected"  # convention: protected (single _)

    def get_protected(self):
        return self._protected

d = Demo()
print("Public:", d.public)
print("Protected (via method):", d.get_protected())
print("Protected (direct):", d._protected)  # still accessible, convention only
