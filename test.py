firstNumber = int(input("Enter the first number: "))
secondNumber = int(input("Enter the second number: "))
if firstNumber > secondNumber:
    print(firstNumber)
    print(secondNumber)
elif secondNumber > firstNumber:
    print(secondNumber)
    print(firstNumber)
else:                        # If both numbers are equal, we can print either one of them
    print(firstNumber)
    print(secondNumber)