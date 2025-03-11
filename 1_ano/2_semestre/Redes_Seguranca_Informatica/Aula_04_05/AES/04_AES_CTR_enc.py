# pip install pycryptodome
# https://pycryptodome.readthedocs.io/en/latest/src/cipher/aes.html
from Crypto.Cipher import AES
from base64 import b64encode
import json

key=b"oarrozdecabidela"
cipher = AES.new(key,AES.MODE_CTR)

# Ler ficheiro
file = input('Nome do ficheiro a ler: ')
with open(file,"r") as f:
    data = f.read()
#print('Mensagem lida:\n',data)

# Encriptar
ciphertext = cipher.encrypt(data.encode())
# Obter Nonce
nonce = b64encode(cipher.nonce).decode()
# Obter texto encriptado
ct = b64encode(ciphertext).decode()
# Criar JSON com resultado
result = json.dumps({'nonce':nonce, 'ciphertext':ct})
print('Mensagem a criar:\n',result)

# Escrever ficheiro
file = input('Nome do ficheiro a criar: ')
with open(file,"w") as f:
    f.write(result)
