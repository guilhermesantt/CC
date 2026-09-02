salario = float(input("Digite seu salário: "))
dez = salario / 100 * 10
quinze = salario / 100 * 15
if salario > 1250:
    print(f"Seu salário terá um aumento de 10% e será {salario + dez}")
elif salario <= 1250:
        print(f"Seu salário terá um aumento de 15% e será {salario + quinze}")
