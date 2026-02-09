"""Program to demonstrate regular expression module."""

import re

text = "Contact: alice@email.com or bob@test.org"
pattern = r"\b[\w.-]+@[\w.-]+\.\w+\b"
emails = re.findall(pattern, text)
print("Emails found:", emails)

s = "Hello World 123"
print("Digits:", re.findall(r"\d+", s))
print("Match at start:", re.match(r"Hello", s))
print("Search:", re.search(r"\d+", s).group())

new_s = re.sub(r"\d+", "X", s)
print("After sub:", new_s)
