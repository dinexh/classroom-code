"""Program to demonstrate str & int methods."""

# str methods
s = "  Hello World  "
print("upper:", s.upper())
print("lower:", s.lower())
print("strip:", s.strip())
print("replace:", s.replace("World", "Python"))
print("split:", "a,b,c".split(","))
print("join:", "-".join(["a", "b", "c"]))
print("isdigit:", "123".isdigit(), "abc".isdigit())

# int methods
n = 42
print("\nint to str:", str(n))
print("bin:", bin(n))
print("hex:", hex(n))
print("bit_length:", n.bit_length())
