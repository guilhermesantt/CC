maior_altura = 0
menor_altura = float('inf')
soma_alt_masc = 0
qtd_masc = 0
qtd_fem = 0

for i in range(15):
    altura = float(input(f"Altura da pessoa {i+1}: "))
    genero = input("Gênero (M/F): ").upper()

    # Verificação de maior e menor
    if altura > maior_altura: maior_altura = altura
    if altura < menor_altura: menor_altura = altura

    # Contabiliza por gênero
    if genero == 'M':
        soma_alt_masc += altura
        qtd_masc += 1
    elif genero == 'F':
        qtd_fem += 1

media_masc = soma_alt_masc / qtd_masc if qtd_masc > 0 else 0

print(f"\nMaior altura: {maior_altura}m ---- Menor altura: {menor_altura}m")
print(f"Média masculina: {media_masc:.2f}m")
print(f"Total de mulheres: {qtd_fem}")