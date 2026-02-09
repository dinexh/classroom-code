"""Program to demonstrate Exception Handling (index out of bound)."""

lst = [10, 20, 30, 40]

try:
    index = int(input("Enter index: "))
    print("Element at index", index, ":", lst[index])
except IndexError:
    print("Error: Index out of range. List has", len(lst), "elements (0 to", len(lst) - 1, ")")
