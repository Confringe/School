import random
string=""
while string != "Hello World":
    string=""
    for x in range(0,11):
        string+=chr(random.randint(32, 126))
        print(string)
print(string)