import json
import xml.etree.ElementTree as ET

with open('produtos.json') as file:
    data_json = json.load(file)

tree = ET.parse('produtos.xml')
root = tree.getroot()

option = 0
while (option != 3):
    print()
    print("1. JSON")
    print("2. XML")
    print("3. Sair")
    option = int(input("Escolha o formato do arquivo que deseja visualizar: "))
    if (option == 1):
        print("Produtos em JSON:")
        for product in data_json['products']:
            print("Nome: " + str(product['name']))
            print("Preço: " + str(product['price']))
            print("Categoria: " + str(product['category']))
            print("Imagem: " + str(product['img']))
            print("================================")
    elif (option == 2):
        print("Produtos em XML:")
        for product in root:
            print("Nome: " + product.find('name').text)
            print("Preço: " + product.find('price').text)
            print("Categoria: " + product.find('category').text)
            print("Imagem: " + product.find('img').text)
            print("================================")
    elif (option == 3):
        print("A sair...")
    else:
        print("Opção inválida")