city = "London"
summer = "Barcelona, Rome, Istanbul, Lisbon, Paris"
winter = "Oslo, Helsinki, Sydney, Cape Town, Vienna"

if (city in summer) or (city in winter):
    if city in summer:
        print("You should visit it in the summer!")
    else:
        print("You should visit it in the winter!")
else:
    print("I don't know what the best season is :(")