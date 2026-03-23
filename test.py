# Function to test if a number is Positive, Negative, or Zero
def check_num(n):
    if n > 0:
        print("Positive")
    elif n < 0:
        print("Negative")
    else:
        print("Zero")

# Take input from user
num = int(input())

# Call the function
check_num(num)