quant_km = float(input("Digite a quantidade de Km percorridos: "))
dias = float(input("Informe a quantidade de dias alugados: "))
calculo = (quant_km*0.15) + (dias*60)
print(f"O valor do aluguel do veículo ficou por R$ {calculo}")