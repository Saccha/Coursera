num=int(input('digite um numero: '))

num1=num
rest1=num%10

while num//10!=0:
    num=num//10
    rest=num%10

    if rest==rest1:
        print('sim')
        num = num1
        break

    rest1 = rest

if num//10 == 0:
    print('nao')
