"""Program to demonstrate lambda function."""

# Lambda: anonymous single-expression function
square = lambda x: x ** 2
print("square(5):", square(5))

add = lambda a, b: a + b
print("add(3, 4):", add(3, 4))

# With built-ins
lst = [1, 2, 3, 4, 5]
doubled = list(map(lambda x: x * 2, lst))
print("doubled:", doubled)

evens = list(filter(lambda x: x % 2 == 0, lst))
print("evens:", evens)

# Sort by key
pairs = [(1, "one"), (3, "three"), (2, "two")]
pairs.sort(key=lambda p: p[0])
print("sorted by number:", pairs)
