"""Program to demonstrate custom module."""

import mymodule

print(mymodule.greet("Alice"))
print("Sum:", mymodule.add(10, 20))
print("PI:", mymodule.PI)

# Alternative
from mymodule import greet, add
print(greet("Bob"))
print(add(5, 15))
