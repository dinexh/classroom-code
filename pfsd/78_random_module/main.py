"""Program to demonstrate random module."""

import random

print("Random float [0,1):", random.random())
print("Random int 1-10:", random.randint(1, 10))
print("Random choice from list:", random.choice([1, 2, 3, 4, 5]))
print("Shuffle sample:", random.sample(range(10), 3))

lst = [1, 2, 3, 4, 5]
random.shuffle(lst)
print("Shuffled list:", lst)

print("Random float in range:", random.uniform(1.0, 5.0))
