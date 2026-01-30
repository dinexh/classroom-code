"""Program on Dictionary Data type & its operations."""

# Create dict
d = {"name": "Alice", "age": 25, "city": "Mumbai"}
print("Dict:", d)

# Access
print("Name:", d["name"])
print("Age:", d.get("age"))
print("Missing key:", d.get("country", "N/A"))

# Add/Update
d["country"] = "India"
d["age"] = 26
print("After update:", d)

# Keys, values, items
print("Keys:", d.keys())
print("Values:", d.values())
print("Items:", d.items())

# Remove
del d["city"]
print("After del:", d)
popped = d.pop("country")
print("Popped:", popped, "Dict:", d)
