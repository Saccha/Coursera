segundos = int(input("Por favor, entre com o número de segundos que deseja converter: "))

hora = segundos // 3600
segundosresto = segundos % 3600
dias = hora // 24
hora = hora % 24
minutos = segundosresto // 60
segundospos = segundosresto % 60

print(dias, "dias,", hora, "horas,", minutos, "minutos e", segundospos, "segundos.")
