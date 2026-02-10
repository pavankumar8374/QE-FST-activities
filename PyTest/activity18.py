import pandas as pd

# df=pd.read_excel('./he.xlsx')
# print(df)

data={
    'id':[1,2,3],
    'name':['a','b','c']
}

df=pd.DataFrame(data)
df.to_excel("new.xlsx",index=False)
print(df)