import json

dados = {}

option = 0

while (option != 3):
    print()
    print("1. Escrever dados no json")
    print("3. Sair")
    option = int(input("Escolha a opção desejada: "))
    if (option == 1):
        print()
        new_campos = input("Digite o novo campo: ")
        new_data = input("Digite o novo dado: ")
        dados[new_campos] = new_data
        with open('dados.json', 'w') as file:
            json.dump(dados, file, indent=4)
        print("Dados salvos com sucesso!")
        print()
        
    elif (option == 3):
        print("A sair...")
    else:
        print("Opção inválida")