import pytest
@pytest.fixture
def wallet_amount():
    amount=0
    return amount
@pytest.mark.parametrize("earned, spent, expected", [ (30, 10, 20), (20, 2, 18), ])
def test_amount(wallet_amount,earned,spent,expected):
   
    wallet_amount+=earned
    wallet_amount-=spent
    assert wallet_amount==expected
    