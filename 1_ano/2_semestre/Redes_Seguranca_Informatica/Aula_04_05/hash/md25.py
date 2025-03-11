# pip install pycryptodome
from Crypto.Hash import MD2, MD5
msg = input('Mensagem..:  ').encode('utf-8')

# MD2
# https://pycryptodome.readthedocs.io/en/latest/src/hash/md2.html
md2 = MD2.new(msg)
print('MD2.......: ',md2.hexdigest())

# MD5
# https://pycryptodome.readthedocs.io/en/latest/src/hash/md5.html
md5 = MD5.new(msg)
print('MD5.......: ',md5.hexdigest())
