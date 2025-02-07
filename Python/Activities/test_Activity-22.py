import pytest
import math

def test_add():
   num1=10
   num2=11
   sum=int(num1)+int(num2)
   assert sum == 21

def test_difference():
   num1=20
   num2=10
   sub=int(num1)-int(num2)
   assert sub==10
	
@pytest.mark.activity
def test_multiply():
   num1=3
   num2=5
   multiply=int(num1)*int(num2)
   assert multiply ==15
	
@pytest.mark.activity
def test_divide():
   num1=10
   num2=2
   divide=int(num1)/int(num2)
   assert divide == 5

