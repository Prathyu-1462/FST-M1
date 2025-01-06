my_list1=list(input("Enter numbers for list1:").split(","))
my_list2=list(input("Enter numbers for list2:").split(","))

my_list3=[]
for numbers in my_list1:
    
    if(int(numbers)%2!=0):
        my_list3.append(numbers)
    
for number in my_list2:
    if(int(number)%2==0):
       my_list3.append(number)
print(my_list3)