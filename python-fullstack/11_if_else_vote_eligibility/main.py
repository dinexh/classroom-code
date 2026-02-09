"""Program on if else to check vote eligibility."""

age = int(input("Enter your age: "))

if age >= 18:
    print("You are eligible to vote")
else:
    print("You are not eligible to vote. You need", 18 - age, "more years.")
