import math
catetoo = float(input("Comprimento do cateto oposto: "))
catetoa = float(input("Comprimento do cateto adjacente: "))
hipotenusa = (catetoo*catetoo) + (catetoa*catetoa)
print(f"A hipotenusa vai medir {math.sqrt(hipotenusa):.2f}")