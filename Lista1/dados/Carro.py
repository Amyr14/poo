
class Carro :

    tempo_min = 0

    def __init__(self, modelo: str, placa: str) :
        self.modelo = modelo
        self.placa = placa
    

    def __str__(self) :
        return 'Carro -> modelo={} placa={} tempo={}'.format(self.modelo, self.placa, self.tempo)
    
    
    def aumentar_tempo(self) :
        self.tempo_min += 1