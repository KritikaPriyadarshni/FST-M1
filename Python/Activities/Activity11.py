fruit_shop = {
    "apple": 10,
    "banana": 15,
    "orange": 8,
    "peaches": 15
}

fruit_select = input("Select one fruit of your choice: ").lower()

if(fruit_select in fruit_shop):
    print("Yes, this is available")
else:
    print("No, this is not available")