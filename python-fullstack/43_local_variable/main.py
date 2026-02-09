"""Program to demonstrate local variable in function."""

x = 10  # global

def my_func():
    y = 20   # local - only visible inside function
    print("Inside function: x =", x, ", y =", y)

my_func()
print("Outside: x =", x)
# print(y)  # NameError - y is local to my_func
