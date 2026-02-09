"""Program to demonstrate CSV File Handling (Displaying record based on ID)."""

import csv

search_id = input("Enter ID to search: ")

with open("data.csv", "r", newline="") as f:
    reader = csv.DictReader(f)
    for row in reader:
        if row.get("id") == search_id:
            print("Record found:", row)
            break
    else:
        print("No record found for ID", search_id)
