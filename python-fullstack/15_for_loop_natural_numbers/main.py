"""Program on for loop to print natural numbers."""

n = int(input("Enter n (number of natural numbers): "))

print("Natural numbers from 1 to", n, ":")
for i in range(1, n + 1):
    print(i, end=" ")
print()
