"""Program to demonstrate Exception Handling (index out of bound) - alternate."""

def get_element(lst, i):
    try:
        return lst[i]
    except IndexError as e:
        return f"IndexError: {e}"

data = [1, 2, 3]
print(get_element(data, 1))
print(get_element(data, 10))
