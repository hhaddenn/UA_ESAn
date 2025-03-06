# pip install pycryptodome
# https://pycryptodome.readthedocs.io/en/latest/src/cipher/aes.html
from Crypto.Cipher import AES
from base64 import b64decode
import json

key=b"aaaabbbbccccdddd"


# Abrir Ficheiro
with open("msg_enc.json","r") as f:
    data = json.loads(f.read())


# Desencriptar
nonce = b64decode(data['nonce'])
ct = b64decode(data['ciphertext'])
cipher = AES.new(key,AES.MODE_CTR,nonce = nonce)
msg = cipher.decrypt(ct)

# Apresentar mensagem
print("Mensagem:\n",msg.decode())
