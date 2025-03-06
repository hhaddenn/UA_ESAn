# Adaptado de: https://gist.github.com/lopes/7ed4a8392fe7b69307155ab379846019
# pip install pycryptodome
# https://pycryptodome.readthedocs.io/en/latest/src/cipher/aes.html
from Crypto.Cipher import AES
from hashlib import md5
from base64 import b64decode
from base64 import b64encode


# Gerir tamanho para ocupar um bloco inteiro
BLOCK_SIZE = 16  # Bytes
pad = lambda s: s + (BLOCK_SIZE - len(s) % BLOCK_SIZE) * \
                chr(BLOCK_SIZE - len(s) % BLOCK_SIZE)
unpad = lambda s: s[:-ord(s[len(s) - 1:])]


class AESCipher:
    """
    Usage:
        c = AESCipher('password').encrypt('message')
        m = AESCipher('password').decrypt(c)
    Tested under Python 3 and PyCrypto 2.6.1.
    """

    def __init__(self, key):
        self.key = md5(key.encode('utf8')).hexdigest()

    def encrypt(self, raw):
        raw = pad(raw)
        cipher = AES.new(self.key.encode("utf8"), AES.MODE_ECB)
        return b64encode(cipher.encrypt(raw.encode('utf8')))

    def decrypt(self, enc):
        enc = b64decode(enc)
        cipher = AES.new(self.key.encode("utf8"), AES.MODE_ECB)
        return unpad(cipher.decrypt(enc)).decode('utf8')

##
# MAIN
# Ler mensagem
key = 'aaaabbbbccccdddd'
msg = input('Mensagem..: ')

print('Ciphertext:', AESCipher(key).encrypt(msg).decode())
