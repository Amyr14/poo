
from dados.Carro import Carro
from dados.Estacionamento import Estacionamento

carro1 = Carro('Sentra', 'ABC123')
carro2 = Carro('Astra', 'HEX421')
carro1.tempo = 10
carro2.tempo = 20
estacionamento = Estacionamento(2)
estacionamento.add_carro(carro1)
estacionamento.add_carro(carro2)
print(carro1, carro2)
print(estacionamento)
input()