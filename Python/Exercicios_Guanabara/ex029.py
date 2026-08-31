velocidade = int(input("Qual é a velocidade atual do carro? "))
if velocidade <= 80:
    print("\033[32m Você está dentro da velocidade permitida \033[0m")
else:
    print("\033[31m Você ultrapassou a velocidade permitida!! \033[0m")
