"""Program on for loop with mod operator."""

print("Numbers 1 to 20 divisible by 3 (using mod %):")
for i in range(1, 21):
    if i % 3 == 0:
        print(i, end=" ")
print()
