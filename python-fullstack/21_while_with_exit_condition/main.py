"""Program on while with exit condition."""

print("Enter numbers. Type 'quit' to exit.")
while True:
    user_input = input("Enter a number: ")
    if user_input.lower() == "quit":
        print("Exiting...")
        break
    try:
        num = int(user_input)
        print("You entered:", num)
    except ValueError:
        print("Invalid input. Enter a number or 'quit'.")
