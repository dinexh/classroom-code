"""Program to demonstrate CSV File Handling (writing data into new CSV file)."""

import csv

rows = [
    ["name", "age", "city"],
    ["Alice", 25, "Mumbai"],
    ["Bob", 30, "Delhi"],
    ["Charlie", 22, "Chennai"],
]

with open("output.csv", "w", newline="") as f:
    writer = csv.writer(f)
    writer.writerows(rows)

print("Data written to output.csv")
