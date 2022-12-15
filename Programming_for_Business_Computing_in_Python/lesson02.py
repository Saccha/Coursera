#該怎麼找錢
a=int(input())
a<=1000
b=1000-a #總共要找的錢

c=int(b/500) #500找c張
d=int((b%500)/100) #100找d張
e=int(b%500%100/50) #50找e張
f=int(b%500%100%50/10) #10找f張
g=int(b%500%100%50%10/5) #5找g張
h=int(b%500%100%50%10%5/1) #1元找h張

print(str(c), str(d),str(e), str(f), str(g), str(h))