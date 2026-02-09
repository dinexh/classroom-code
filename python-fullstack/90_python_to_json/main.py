"""Program to Convert from Python to JSON."""

import json

data = {"name": "Alice", "age": 25, "city": "Mumbai", "active": True}
json_str = json.dumps(data)

print("JSON string:", json_str)
print("Type:", type(json_str))

# With indentation
print("\nPretty print:")
print(json.dumps(data, indent=2))
