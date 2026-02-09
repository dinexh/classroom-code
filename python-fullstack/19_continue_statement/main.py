"""Program on continue statement."""

print("Skipping even numbers (printing only odd 1-10):")
for i in range(1, 11):
    if i % 2 == 0:
        continue
    print(i)

print("Loop ended")
