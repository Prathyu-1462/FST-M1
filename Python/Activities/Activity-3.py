user1=input("what's ur name: ")
user2=input("what's ur name: ")
user1_choice=input(user1+",what do you want to select: ").lower()
user2_choice=input(user2+",what do you want to select: ").lower()


if user1_choice == user2_choice:
    print("It's a tie!")
elif user1_choice == 'rock':
    if user2_choice == 'scissors':
        print(user1+" wins!")
    else:
        print(user2+" wins!")
elif user1_choice == 'scissors':
    if user2_choice == 'paper':
        print(user1+" win!")
    else:
        print(user2+"wins!")
elif user1_choice == 'paper':
    if user2_choice == 'rock':
        print(user1+" wins!")
    else:
        print(user2+" win!")
else:
    print("Invalid input! You have not entered rock, paper or scissors, try again.")