import pandas
from pandas import read_excel
dataframe=pandas.read_excel("Activity-20.xlsx")
print(dataframe)
print("==============================================================")
print(dataframe.shape)
print("******************************************************")
print(dataframe["Email"])
print("*****************************************************")
	
print(dataframe.sort_values("firstName"))
