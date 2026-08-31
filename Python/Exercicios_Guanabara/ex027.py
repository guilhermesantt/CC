nome = input("Digite seu nome completo: ".strip())
palavras = nome.split()
print(f"Seu primeiro nome é {palavras[0]}")
print(f"Seu último nome é {palavras[-1]}")