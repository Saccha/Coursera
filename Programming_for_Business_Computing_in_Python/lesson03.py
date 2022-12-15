#怎麼找錢進階版
a=int(input())
a<=1000
b=1000-a #總共要找的錢

c=int(b/500) #500找c張
d=int((b%500)/100) #100找d張
e=int(b%500%100/50) #50找e張
f=int(b%500%100%50/10) #10找f張
g=int(b%500%100%50%10/5) #5找g張
h=int(b%500%100%50%10%5/1) #1元找h張
    
if c!= 0:
    print("500, " + str(c) + "; ", end="")
if d!= 0:
    print("100, " + str(d) + "; ", end="")
if e!= 0:
    print("50, " + str(e) + "; ", end="")
if f!= 0:
    print("10, " + str(f) + "; ", end="")
if g!= 0:
    print("5, " + str(g) + "; ", end="")
if h!= 0:
    print("1, " + str(h))
