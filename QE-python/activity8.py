
def find(arr):
    if arr[0]==arr[-1]:
        return True
    return False
arr=list(map(int,input('enter').split()))
print(find(arr))