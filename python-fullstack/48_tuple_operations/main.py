"""Program on Tuple Data type & its operations."""

# Create tuple (immutable)
t = (1, 2, 3, 4, 5)
print("Tuple:", t)

# Indexing, slicing
print("First:", t[0], "Last:", t[-1])
print("Slice:", t[1:4])

# len, count, index
print("Length:", len(t))
print("Count of 2:", t.count(2))
print("Index of 3:", t.index(3))

# Unpacking
a, b, c = (10, 20, 30)
print("Unpacked:", a, b, c)

# Tuple with one element
single = (42,)
print("Single element tuple:", single)
