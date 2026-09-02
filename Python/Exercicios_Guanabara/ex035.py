a = float(input("Digite o primeiro segmento: "))
b = float(input("Digite o segundo segmento: "))
c = float(input("Digite o terceiro segmento: "))
condA = b + c > a
condB = a + c > b
condC = a + b > c

if condA == True and condB == True and condC == True:
    print("Forma um triângulo")
else:
    print("NÃO FORMA UM TRIANGULO")