"""Program to demonstrate os module."""

import os

print("Current directory:", os.getcwd())
print("List files:", os.listdir("."))
print("Path exists:", os.path.exists("main.py"))
print("Is file:", os.path.isfile("main.py"))
print("Is dir:", os.path.isdir("."))
print("Path join:", os.path.join("folder", "file.txt"))
print("Environment HOME:", os.environ.get("HOME", "N/A"))
