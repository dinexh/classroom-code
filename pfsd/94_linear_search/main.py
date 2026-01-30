"""Program to search a key in the given list (Linear Search)."""

def linear_search(lst, key):
    for i, item in enumerate(lst):
        if item == key:
            return i
    return -1

lst = [10, 20, 30, 40, 50]
key = int(input("Enter key to search: "))
index = linear_search(lst, key)
if index >= 0:
    print("Found at index", index)
else:
    print("Not found")
