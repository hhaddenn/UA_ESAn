# pip install pycryptodome
from base64 import b64encode
from Crypto.Cipher import AES
import json

secret = b'oarrozdecabidela'

# Read the filename from the user
filename = input("Enter the filename: ")
with open(filename, 'rb') as file:
    msg = file.read()

# GCM
# https://pycryptodome.readthedocs.io/en/latest/src/cipher/aes.html#crypto-cipher-aes

nonce = b'alozcabidela'

# Encrypt the message and calculate the MAC tag
cipher = AES.new(secret, AES.MODE_GCM, nonce=nonce)
ciphertext, mac_tag = cipher.encrypt_and_digest(msg)

# Create a JSON object with the filename, nonce, ciphertext, and MAC
data = {
    'filename': filename,
    'nonce': b64encode(nonce).decode('utf-8'),
    'ciphertext': b64encode(ciphertext).decode('utf-8'),
    'mac_tag': b64encode(mac_tag).decode('utf-8')
}

# Save the MAC tag to a file
with open('gcm_tag.json', 'w') as file:
    json.dump(data, file)

print('MAC tag saved to gcm_tag.json')