import pytest


# Define a fixture for the wallet amount
@pytest.fixture
def wallet():
    amount = 0
    return amount

@pytest.mark.parametrize("earned, spent, expected", [(30, 10, 20), (20, 2, 18), ])
def test_transactions(wallet, earned, spent, expected):
    wallet += earned
    wallet -= spent

    # Assertion
    assert wallet == expected
