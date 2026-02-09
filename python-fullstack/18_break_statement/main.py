"""Program on break statement."""

print("Breaking when 5 is found:")
for i in range(1, 11):
    if i == 5:
        print("Found 5 - breaking!")
        break
    print(i)

print("Loop ended")
