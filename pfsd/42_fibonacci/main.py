"""Program to find Fibonacci of a given number."""

def fibonacci(n):
    if n <= 0:
        return []
    if n == 1:
        return [0]
    fib = [0, 1]
    for i in range(2, n):
        fib.append(fib[i - 1] + fib[i - 2])
    return fib

num = int(input("Enter n (number of Fibonacci terms): "))
result = fibonacci(num)
print("Fibonacci sequence:", result)
if num > 0:
    print("n-th Fibonacci value:", result[-1] if num > 1 else 0)
