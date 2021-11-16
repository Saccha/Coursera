def fizzbuzz(numero):

    buzz = numero % 5
    fizz = numero % 3

    if buzz == 0 and fizz == 0:
        return "FizzBuzz"
    elif buzz == 0 and fizz != 0:
        return "Buzz"
    elif buzz != 0 and fizz == 0:
        return "Fizz"
    else:
        return numero
