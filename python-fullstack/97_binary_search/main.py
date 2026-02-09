"""Program to demonstrate Binary Search."""

def binary_search(lst, key):
    left, right = 0, len(lst) - 1
    while left <= right:
        mid = (left + right) // 2
        if lst[mid] == key:
            return mid
        if lst[mid] < key:
            left = mid + 1
        else:
            right = mid - 1
    return -1

lst = [1, 3, 5, 7, 9, 11]
key = int(input("Enter key to search: "))
index = binary_search(lst, key)
if index >= 0:
    print("Found at index", index)
else:
    print("Not found")
