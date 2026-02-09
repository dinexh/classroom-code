"""Program to demonstrate global variable in function."""

count = 0  # global

def increment():
    # Reading global is fine
    print("Count (read):", count)

def increment_wrong():
    # count += 1  # UnboundLocalError - can't assign without global
    pass

increment()
