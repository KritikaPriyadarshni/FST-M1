PlayerA = input("Enter name of first player:")
PlayerB = input("Enter name of second player:")

ChoiceA = input("Enter choice of first player:")
ChoiceB = input("Enter choice  of second player:")


if ChoiceA == ChoiceB:
    print("It's a tie!")
elif ChoiceA == 'rock':
    if ChoiceB == 'scissors':
        print("Rock wins!")
    else:
        print("Paper wins!")
elif ChoiceA == 'scissors':
    if ChoiceB == 'paper':
        print("Scissors win!")
    else:
        print("Rock wins!")
elif ChoiceA == 'paper':
    if ChoiceB == 'rock':
        print("Paper wins!")
    else:
        print("Scissors win!")
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")
