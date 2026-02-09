"""Program on while loop with else condition."""

# else in while: executed when loop completes normally (no break)
count = 0
while count < 3:
    print("Count:", count)
    count += 1
else:
    print("While loop completed normally")

print()

# When break is used, else is not executed
count = 0
while count < 5:
    if count == 2:
        print("Breaking at 2")
        break
    print("Count:", count)
    count += 1
else:
    print("This won't print")
