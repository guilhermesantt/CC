import random
from time import sleep
print("-=-"*20)
print("Vou pensar em um número entre 0 e 5. Tente adivinhar... ")
print("-=-"*20)
sleep(1)
print("PENSADOOOOO.....")
sleep(2.5)
numero = int(input("Em que número eu pensei? "))

numero_maquina = random.randint(1, 5)
if numero == numero_maquina:
    print("Você me venceu!!!!!")
else:
    print(f"Você errou!! o número escolhido foi {numero_maquina}")