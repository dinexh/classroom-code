"""Program on for loop to print even numbers."""

n = int(input("Enter n (upper limit): "))

print("Even numbers from 1 to", n, ":")
for i in range(2, n + 1, 2):
    print(i, end=" ")
print()
