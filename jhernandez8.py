#Johnny hernandez
#CSC 321
#lab 8
import random

randNum = random.randint(0,9)
tries = 3
attempts = 0
guess = 0
i = 0
count = 0

print("you only have 3 tries")
while tries > 0:
    guess = int(input("Guess a number: "))
    attempts += 1
    tries -= 1

    if guess < randNum:
        print(f"too low (you have {tries} left)\n")
    elif guess > randNum:
        print(f"too high (you have {tries} left)\n")
    elif guess == randNum:
        print(f"Congratualtion! It took you {attempts} attempts\n")
        break
tries -= 1
if tries == -1:
    print("loser\n")

for i in range(3):
    print("why did the chicken cross the street? to get to the other side\n")

while count < 3:
    print("my favorit food is pizza\n")
    count += 1
