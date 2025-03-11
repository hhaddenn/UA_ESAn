# pip install pycryptodome
from Crypto.Hash import CMAC
from Crypto.Cipher import AES
import json

secret = b'oarrozdecabidela'

# HMAC
# https://pycryptodome.readthedocs.io/en/latest/src/hash/hmac.html

# Read the filename from the user
filename = input("Enter the filename: ")

# Calculate the MAC tag
hmac = CMAC.new(secret, ciphermod=AES)
with open(filename, 'rb') as file:
    msg = file.read()
hmac.update(msg)
mac_tag = hmac.hexdigest()

# Create a JSON object with the filename and MAC tag
data = {
    'filename': filename,
    'mac_tag': mac_tag
}

# Write the JSON object to a file
with open('cmac_tag.json', 'w') as json_file:
    json.dump(data, json_file)

print('MAC tag saved to cmac_tag.json')