"""Program to demonstrate Exception Handling (IndexError)."""

my_list = [1, 2, 3]

try:
    value = my_list[5]
except IndexError as e:
    print("IndexError caught:", e)
