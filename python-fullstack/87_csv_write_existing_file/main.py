"""Program to demonstrate CSV File Handling (writing data into existing CSV file)."""

import csv

# Append new row to existing file
with open("data.csv", "a", newline="") as f:
    writer = csv.writer(f)
    writer.writerow([4, "David", 55000])

print("New row appended to data.csv")
