c=int(input("單位成本： ")) #進貨成本
r=int(input("單位零售價： ")) #單位零售價
N=int(input("需求可能數： ")) #預估需求可能數
q=int()

list = []
for i in range(N+1):
    list.append(float(input()))

exp = 0
maxP = 0
qMax=0
profit=0
sum = 0.0
prob = 0.0
N=8
for q in range(N+1):
    sum=0.0
    prob=0.0
    for p in range(0,q+1) :
        exp=r*min(p,q)-c*q
        if p != q :
            sum += list[p]* exp
            prob += list[p]
        else:
            sum += (1-prob) * exp
            break
    if sum > maxP :
        maxP = sum
        qMax = q
        profit = int(maxP)
2
print(str(qMax)+" "+str(profit))
