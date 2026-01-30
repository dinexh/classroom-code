"""Program on while loop to print even numbers."""

n = int(input("Enter n (upper limit): "))
i = 2

print("Even numbers from 1 to", n, ":")
while i <= n:
    print(i, end=" ")
    i += 2
print()
