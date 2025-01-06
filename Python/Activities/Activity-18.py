'''
Print the values only in the Usernames column
Print the username and password of the second row
Sort the Usernames column data in ascending order and print data
Sort the Passwords column in descending order and print data
'''
import pandas
dataframe=pandas.read_csv("sample.csv")

print("Usernames:")
print(dataframe["Usernames"])
print("===============")
print(dataframe["Usernames"][1],"|",dataframe["Passwords"][1])
print("====================================")
print("Data sorted in ascending Usernames:")
print(dataframe.sort_values("Usernames",key=lambda col:col.str.lower(),ascending=True))
print("====================================")
print("Data sorted in descending Paswwords:")
print(dataframe.sort_values("Passwords", ascending=False))
