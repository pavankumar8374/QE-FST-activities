import pytest
@pytest.fixture
def wallet():
    amount=0


@pytest.mark.parametrize("earned,spent,expected",[(30,10,20),(20,2,18)])
def test_cal(earned,spent,expected):
    assert earned-spent==expected