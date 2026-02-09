"""Program to demonstrate datetime module."""

import datetime

now = datetime.datetime.now()
print("Now:", now)
print("Date:", now.date())
print("Time:", now.time())
print("Year:", now.year, "Month:", now.month, "Day:", now.day)

today = datetime.date.today()
print("Today:", today)

# timedelta
delta = datetime.timedelta(days=7)
future = today + delta
print("One week from today:", future)
