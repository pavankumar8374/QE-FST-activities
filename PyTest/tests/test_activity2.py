import pytest


@pytest.fixture
def list_p():
    return [0,1,2,3,4,5,6,7,8,9,10]


def test_listsum(list_p):
    s=0
    for i in list_p:
        s+=i
    assert s==55
