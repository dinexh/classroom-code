"""Program to remove duplicate elements in the list."""

# Using set (order may change)
lst = [1, 2, 2, 3, 4, 3, 5, 1]
unique_set = list(set(lst))
print("Using set:", unique_set)

# Preserve order
seen = set()
unique_ordered = []
for x in lst:
    if x not in seen:
        seen.add(x)
        unique_ordered.append(x)
print("Preserve order:", unique_ordered)
