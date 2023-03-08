
import json

class Filme:
    titulo = ""
    classificacao = ""
    nota = ""
    ano = ""

    def converte_json(self, dicionario):
        self.titulo = dicionario['titulo']
        self.classificacao = dicionario['classificacao']
        self.nota = dicionario['nota']
        self.ano = dicionario['ano']

    def __str__(self):
        return 'titulo : {} , classificacao : {}, nota : {}, ano : {}'.format(self.titulo, self.classificacao, self.nota, self.ano)