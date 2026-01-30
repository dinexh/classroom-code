"""Program on while loop to print natural numbers."""

n = int(input("Enter n (number of natural numbers): "))
i = 1

print("Natural numbers from 1 to", n, ":")
while i <= n:
    print(i, end=" ")
    i += 1
print()
