def fibonacci(num):
    mylist=[]
    if int(num)<=1:
        return 1
    else:
        return(fibonacci(int(num)-1)+fibonacci(int(num)-2))
       
num=int(input("Enter num: "))
if(num<=0):
    print("please enter positive value")
else:
    for n in range(num):
        print(fibonacci(n),end =" ")