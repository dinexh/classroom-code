"""Program to demonstrate global keyword in function."""

count = 0

def increment():
    global count
    count += 1
    print("Inside:", count)

print("Before:", count)
increment()
increment()
print("After:", count)
