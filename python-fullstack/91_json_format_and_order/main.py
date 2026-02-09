"""Program to demonstrate JSON Format and Order."""

import json

# Python 3.7+ preserves dict order
data = {"z": 1, "a": 2, "m": 3}
json_str = json.dumps(data, sort_keys=True)  # sort_keys for consistent order
print("With sort_keys:", json_str)

# indent for readable format
print("\nIndented:")
print(json.dumps(data, indent=2, sort_keys=True))

# separators
print("\nCustom separators:", json.dumps(data, separators=(",", ":")))
