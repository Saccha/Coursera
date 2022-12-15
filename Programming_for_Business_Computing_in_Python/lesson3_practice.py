#轉帳金額確認
x1=int(input()) #x1帳戶的錢
x2=int(input()) #x2帳戶的錢
y=int(input()) #想轉出的錢

if x1>=y:
    x1=x1-y
    x2=x2+y
else:
    x2=x1+x2
    x1=0

print(str(x1), str(x2))
