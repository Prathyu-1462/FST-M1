def sum(num):
    total=0
    for number in num:
        total=total+int(number)
    return total

my_list=list(input("Enter the list of values: ").split(","))
print("sum of the numbers in the list: ",sum(my_list))