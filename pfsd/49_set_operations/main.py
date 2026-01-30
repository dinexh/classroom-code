"""Program on Set Data type & its operations (unordered, no duplicates)."""

# Create set
s = {1, 2, 3, 4, 5}
print("Set:", s)

# Add
s.add(6)
s.add(2)  # duplicate - no effect
print("After add:", s)

# Remove, discard
s.remove(6)
s.discard(10)  # no error if not present
print("After remove/discard:", s)

# Union, intersection, difference
a = {1, 2, 3}
b = {3, 4, 5}
print("Union:", a | b)
print("Intersection:", a & b)
print("Difference a-b:", a - b)

# len, in
print("Length:", len(s))
print("3 in set:", 3 in s)
