
class Estacionamento :

    carros = []
    quant_carros = 0
   
    def __init__(self, limite_carros: int) :
        self.limite_carros = limite_carros

    def __str__(self) :
        return 'Estacionamento -> limite={} quant_carros={}'.format(self.limite_carros, self.quant_carros)

    def add_carro(self, carro) :
        if self.quant_carros < self.limite_carros :
            self.carros.append(carro)
            self.quant_carros += 1