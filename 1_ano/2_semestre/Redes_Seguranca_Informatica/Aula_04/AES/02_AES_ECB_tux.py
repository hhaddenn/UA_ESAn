# Adaptado de: https://samsclass.info/141/proj/pCH-ECB.htm
# pip install pycryptodome
# https://pycryptodome.readthedocs.io/en/latest/src/cipher/aes.html
from Crypto.Cipher import AES
key=b'aaaabbbbccccdddd'
cipher = AES.new(key,AES.MODE_ECB)

# Open tux
with open("tux.bmp", "rb") as f:
    clear = f.read()

# Remove heading 64 bytes e trim 2 Bytes
clear_trimmed = clear[64:-2]

# Encrypt
ciphertext = cipher.encrypt(clear_trimmed)
ciphertext = clear[0:64] + ciphertext + clear[-2:]
# Write file
with open("tux_ecb.bmp","wb") as f:
    f.write(ciphertext)