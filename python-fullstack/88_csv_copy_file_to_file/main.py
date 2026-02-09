"""Program to demonstrate CSV File Handling (copying the data from one file to another)."""

import csv

with open("source.csv", "r", newline="") as src:
    reader = csv.reader(src)
    rows = list(reader)

with open("destination.csv", "w", newline="") as dst:
    writer = csv.writer(dst)
    writer.writerows(rows)

print("Data copied from source.csv to destination.csv")
