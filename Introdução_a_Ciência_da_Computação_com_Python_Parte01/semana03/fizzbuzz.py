numero = int(input("Por favor, entre com um número: "))

buzz = numero % 5
fizz = numero % 3

if buzz == 0 and fizz == 0:
    print("FizzBuzz")
else:
    print(numero)
