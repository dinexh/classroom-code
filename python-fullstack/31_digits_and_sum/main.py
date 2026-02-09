"""Program to print digits and sum of digits."""

num = int(input("Enter a number: "))
n = abs(num)
digits = []
total = 0

if n == 0:
    digits = [0]
    total = 0
else:
    while n > 0:
        d = n % 10
        digits.append(d)
        total += d
        n //= 10
    digits.reverse()

print("Digits:", digits)
print("Sum of digits:", total)
