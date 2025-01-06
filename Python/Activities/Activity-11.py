my_dict={
    "apple":100,
    "banana":40,
    "orange":50
}
key=input("enter which fruit you want to check: ")
if(key in my_dict):
    print(key," is present in the dictonaty")
else:
    print(key," is not present in the dictonaty")