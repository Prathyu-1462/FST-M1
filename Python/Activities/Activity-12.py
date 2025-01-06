def recursion(num):
    sum=0
    if num<0:
        return sum
    else:
        sum=num+recursion(num-1)
    return sum

print("Sum of first 10 numbers:" ,recursion(10))