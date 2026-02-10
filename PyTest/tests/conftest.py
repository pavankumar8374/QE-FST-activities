import pytest,requests
from bs4 import BeautifulSoup

@pytest.fixture
def in_val():
    return 12


@pytest.fixture
def view_page():
    response=requests.get('https://www.training-support.net')
    content=response.content
    soup=BeautifulSoup(content,'html.parser')
    return soup

