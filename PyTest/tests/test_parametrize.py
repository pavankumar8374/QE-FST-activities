import pytest
@pytest.mark.parametrize('a,b,c',[(1,1,1),(2,2,2)])
def test_eq(a,b,c):
    assert a==b==c

