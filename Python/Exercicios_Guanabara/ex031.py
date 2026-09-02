distancia = float(input("Quantos KM você andou? "))
if distancia <= 200:
    print(f"Você andou {distancia} e terá que pagar R$ {distancia * 0.50}")
elif distancia > 200:
    print(f"Você andou {distancia} e terá que pagar R$ {distancia * 0.45}")