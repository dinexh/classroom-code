"""Program to print digits from a given number."""

num = int(input("Enter a number: "))
n = abs(num)
digits = []

if n == 0:
    digits = [0]
else:
    while n > 0:
        digits.append(n % 10)
        n //= 10
    digits.reverse()

print("Digits:", digits)
print("Digits (one per line):")
for d in digits:
    print(d)
