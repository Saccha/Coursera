a = int(input("Por favor, entre com um número a: "))
b = int(input("Por favor, entre com um número b: "))
c = int(input("Por favor, entre com um número c: "))

if a < b < c and b < c:
    print("crescente")
else:
    print("não está em ordem crescente")
