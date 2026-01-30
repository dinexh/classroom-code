"""Program on for loop to print odd numbers."""

n = int(input("Enter n (upper limit): "))

print("Odd numbers from 1 to", n, ":")
for i in range(1, n + 1, 2):
    print(i, end=" ")
print()
