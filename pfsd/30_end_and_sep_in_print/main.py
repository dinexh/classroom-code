"""Program to demonstrate end and sep parameters in print() function."""

# end - what to print at the end (default: newline)
print("Hello", end=" ")
print("World", end="!\n")

# sep - separator between multiple arguments (default: space)
print("a", "b", "c")  # default sep is " "
print("a", "b", "c", sep="-")
print("2024", "01", "30", sep="/")
print("one", "two", "three", sep=" | ")

# Combining end and sep
print(1, 2, 3, sep=", ", end=" -> ")
print("done")
