"""Program to demonstrate CSV File Handling (Displaying Total Salary)."""

import csv

total = 0
with open("data.csv", "r", newline="") as f:
    reader = csv.DictReader(f)
    for row in reader:
        total += int(row.get("salary", 0))

print("Total Salary:", total)
