"""Program on List Data type & its operations."""

# Create list
my_list = [1, 2, 3, 4, 5]
print("List:", my_list)

# Indexing
print("First:", my_list[0], "Last:", my_list[-1])

# Slicing
print("Slice [1:4]:", my_list[1:4])

# Append, insert, extend
my_list.append(6)
print("After append:", my_list)
my_list.insert(0, 0)
print("After insert:", my_list)
my_list.extend([7, 8])
print("After extend:", my_list)

# Remove, pop
my_list.remove(0)
print("After remove(0):", my_list)
popped = my_list.pop()
print("Popped:", popped, "List:", my_list)

# len, count, index
print("Length:", len(my_list))
print("Count of 2:", my_list.count(2))
print("Index of 3:", my_list.index(3))
