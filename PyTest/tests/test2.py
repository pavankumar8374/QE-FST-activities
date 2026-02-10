# import pytest

# @pytest.mark.g1
# def testsum():
#     assert 2+3==5

# @pytest.mark.g2
# def tests1():
#     assert 2+3==6

# @pytest.mark.g2
# def tests2():
#     assert 5==4

# def testdif():
#     assert 2-3==-1
# def testpro():
#     assert 2*3==5
# def testquo():
#     assert 4//2 ==2

import pytest


@pytest.fixture
def input_val():
    return 2

def test_divis(input_val):
    assert input_val ==2


