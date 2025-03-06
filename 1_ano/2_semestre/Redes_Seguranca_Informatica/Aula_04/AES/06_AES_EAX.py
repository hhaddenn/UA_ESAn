# pip install pycryptodome
# https://pycryptodome.readthedocs.io/en/latest/src/cipher/aes.html
from Crypto.Cipher import AES
from Crypto.Random import get_random_bytes

key = get_random_bytes(16)

original = input('Introduza o texto original:\n').encode()

cipher = AES.new(key, AES.MODE_EAX)
ciphertext, tag = cipher.encrypt_and_digest(original)
nonce = cipher.nonce

encriptado = nonce + tag + ciphertext

print(f'\nChave:\n{key}\n\nEncriptado:\n{encriptado}\n')


cipher = AES.new(key, AES.MODE_EAX, nonce)
data = cipher.decrypt_and_verify(ciphertext, tag).decode()
print(f'Decrypt:\n{data}')
