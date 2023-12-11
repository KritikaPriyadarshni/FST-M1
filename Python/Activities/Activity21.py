import pytest


# Addition

def add():
    num1 = 10
    num2 = 20

    sum = num1 + num2
    assert sum == 30


# Difference

def difference():
    num1 = 30
    num2 = 10

    diff = num2 - num1

    assert diff == 20


# Multiplication
def multiply():
    num1 = 20
    num2 = 10

    prod = num1 * num2
    assert prod == 200


# Quotient

def quotient():
    num1 = 30
    num2 = 5

    quo = num1 / num2
    assert quo == 6
