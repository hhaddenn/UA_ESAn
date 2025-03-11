# pip install pycryptodome
from Crypto.Hash import HMAC, SHA512, MD5
import json

secret = b'arrozdecabidela'

# HMAC
# https://pycryptodome.readthedocs.io/en/latest/src/hash/hmac.html

# Read the filename from the user
filename = input("Enter the filename: ")

# Calculate the MAC tag
hmac = HMAC.new(secret, digestmod=SHA512)
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
with open('mac_tag.json', 'w') as json_file:
    json.dump(data, json_file)

print('MAC tag saved to mac_tag.json')