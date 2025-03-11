# pip install pycryptodome
from Crypto.Hash import SHA512
msg = input('Mensagem..:  ').encode('utf-8')

# SHA512
# https://pycryptodome.readthedocs.io/en/latest/src/hash/sha512.html
sha_512 = SHA512.new(msg)
print('SHA512....: ',sha_512.hexdigest())

# SHA512/256
sha_512_256 = SHA512.new(msg,truncate="256")
print('SHA512/256: ',sha_512_256.hexdigest())
