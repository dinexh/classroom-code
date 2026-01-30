"""Program to demonstrate CSV File Handling (Display all rows)."""

import csv

with open("data.csv", "r", newline="") as f:
    reader = csv.reader(f)
    for row in reader:
        print(row)

# Create sample data.csv if not exists (for demo)
# data.csv should have: name,age,city in first row and data rows
