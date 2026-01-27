arr1=[1,2,3,4,5]
arr2=[6,7,8,9,10]
newlist=[]
for i in arr1:
    if i%2!=0:
        newlist.append(i)
for j in arr2:
    if j%2==0:
        newlist.append(j)
print(newlist)