value = input("enter touples as camma seperated values").split(",")
a=tuple(value)
print(a)

for num in a:
    if(int(num)%5==0):
        print(num)