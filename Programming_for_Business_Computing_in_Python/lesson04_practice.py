c=int(input("進貨成本： ")) #進貨成本
r=int(input("單位零售價： ")) #單位零售價
N=int(input("需求可能數： ")) #需求可能數
q=int(input("訂貨量： ")) #訂貨量
zero=float(input()) #第0份賣出機率
first=float(input()) #第1份賣出機率
second=float(input())
third=float(input())
fourth=float(input())
fifth=float(input())
sixth=float(input())
seventh=float(input())
eigth=float(input())
profit=int() #輸出結果

if q==0:
    profit==0
if q==1:
    profit=(0-q*c)*zero+(0-q*c+r)*(1-zero)
if q==2:
    profit=(0-q*c)*zero+(0-q*c+r)*first+(0-q*c+2*r)*(1-zero-first)
if q==3:
    profit=(0-q*c)*zero+(0-q*c+r)*first+(0-q*c+2*r)*second+(0-q*c+3*r)*(1-zero-first-second)
if q==4:
    profit=(0-q*c)*zero+(0-q*c+r)*first+(0-q*c+2*r)*second+(0-q*c+3*r)*third+(0-q*c+4*r)*(1-zero-first-second-third)
if q==5:
    profit=(0-q*c)*zero+(0-q*c+r)*first+(0-q*c+2*r)*second+(0-q*c+3*r)*third+(0-q*c+4*r)*fourth+(0-q*c+5*r)*(1-zero-first-second-third-fourth)
if q==6:
    profit=(0-q*c)*zero+(0-q*c+r)*first+(0-q*c+2*r)*second+(0-q*c+3*r)*third+(0-q*c+4*r)*fourth+(0-q*c+5*r)*fifth+(0-q*c+6*r)*(1-zero-first-second-third-fourth-fifth)
if q==7:
    profit=(0-q*c)*zero+(0-q*c+r)*first+(0-q*c+2*r)*second+(0-q*c+3*r)*third+(0-q*c+4*r)*fourth+(0-q*c+5*r)*fifth+(0-q*c+6*r)*sixth+(0-q*c+7*r)*(1-zero-first-second-third-fourth-fifth-sixth)
if q==8:
    profit=(0-q*c)*zero+(0-q*c+r)*first+(0-q*c+2*r)*second+(0-q*c+3*r)*third+(0-q*c+4*r)*fourth+(0-q*c+5*r)*fifth+(0-q*c+6*r)*sixth+(0-q*c+7*r)*seventh+(0-q*c+8*r)*(1-zero-first-second-third-fourth-fifth-sixth-seventh)

print(int(profit))
