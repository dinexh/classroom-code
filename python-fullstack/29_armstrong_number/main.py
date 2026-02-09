"""Program to check Armstrong number or not."""

num = int(input("Enter a number: "))
n = num
order = len(str(n))
total = 0

while n > 0:
    digit = n % 10
    total += digit ** order
    n //= 10

if total == num:
    print(num, "is an Armstrong number")
else:
    print(num, "is not an Armstrong number")
