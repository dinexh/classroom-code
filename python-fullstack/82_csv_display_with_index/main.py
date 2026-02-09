"""Program to demonstrate CSV File Handling (Displaying rows with index)."""

import csv

with open("data.csv", "r", newline="") as f:
    reader = csv.reader(f)
    for index, row in enumerate(reader):
        print(f"Row {index}: {row}")
