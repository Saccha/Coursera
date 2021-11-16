def remove_repetidos(list):
    lista_nova = []

    for i in list:
        exists = False
        for j in lista_nova:
            if i == j:
                exists = True
                break

        if exists == False:
            lista_nova.append(i)

    return sorted(lista_nova)


lista = [7,3,33,12,3,3,3,7,12,100]
#lista = [1,2,3]
print(remove_repetidos(lista))
