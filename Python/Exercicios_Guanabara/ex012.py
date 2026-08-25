preco = float(input("Digite o preço do produto: "))
desconto = preco/100*5
print("APLICANDO DESCONTO...")
print(f"Foi aplicado 5% de desconto no seu produto e ele ficou apenas R$ {preco-desconto:.2f}")
