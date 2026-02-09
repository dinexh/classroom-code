"""Program to parse JSON - Convert from JSON to Python."""

import json

json_str = '{"name": "Alice", "age": 25, "city": "Mumbai"}'
data = json.loads(json_str)

print("Parsed (Python dict):", data)
print("Type:", type(data))
print("Name:", data["name"])
