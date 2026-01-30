"""Program on for loop with else condition."""

# else in for: executed when loop completes normally (no break)
for i in range(3):
    print(i)
else:
    print("For loop completed normally")

print()

# When break is used, else is not executed
for i in range(5):
    if i == 3:
        print("Breaking at 3")
        break
    print(i)
else:
    print("This won't print")
