"""Program to demonstrate CSV File Handling (Displaying record based on ID and Name)."""

import csv

search_id = input("Enter ID: ")
search_name = input("Enter Name: ")

with open("data.csv", "r", newline="") as f:
    reader = csv.DictReader(f)
    for row in reader:
        if row.get("id") == search_id and row.get("name") == search_name:
            print("Record found:", row)
            break
    else:
        print("No matching record found")
