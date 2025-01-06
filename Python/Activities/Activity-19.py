
import pandas
from pandas import ExcelWriter
data={
   'FirstName':["Satvik", "Avinash", "Lahri"],
	'LastName':["Shah", "Kati", "Rath"],
	'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
	'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}
dataframe=pandas.DataFrame(data)
print(dataframe)
writer=ExcelWriter('sample.xlsx')
dataframe.to_excel(writer,'sheet1', index=False)
	
writer.close()






'''

import xlsxwriter
workbook = xlsxwriter.Workbook('sample1.xlsx')
 
# By default worksheet names in the spreadsheet will be 
# Sheet1, Sheet2 etc., but we can also specify a name.
worksheet = workbook.add_worksheet("My sheet")
 
# Create a dictionary that will be used to create the DataFrame
data = (
	["Satvik", "shah", "satshah@example.com","4537829158"],
    ["asasas","Kati","avinashK@example.com","4892184058"],
	["rani","Rath","lahri.rath@example.com","4528727830"]  
)
row = 0
col = 0
for firstname, Lastname, email, phonenumber in data:
    worksheet.write(row, col, firstname)
    worksheet.write(row, col + 1, Lastname)
    worksheet.write(row, col + 2 , email)
    worksheet.write(row, col + 3, phonenumber)
    row += 1

# Create the DataFrame that will be written to the excel file

workbook.close()
'''