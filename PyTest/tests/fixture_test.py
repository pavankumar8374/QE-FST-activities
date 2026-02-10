import pytest
@pytest.mark.m1

def test_div(in_val):
    assert in_val==12


@pytest.mark.m2
def new_one(view_page):
    heading=view_page.find('h1')
    assert heading.text=='Training Support'


